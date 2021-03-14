package com.srijan.weather.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.JsonSyntaxException;
import com.srijan.weather.entities.MausamJankari;
import com.srijan.weather.integration.LatiLongiClient;
import com.srijan.weather.integration.NewsClient;
import com.srijan.weather.integration.WeatherClient;
import com.srijan.weather.model.Location;
import com.srijan.weather.newsEntity.News;

@Controller
public class MausamJankariController {

	@Autowired
	WeatherClient weatherClient;
	
	@Autowired
	NewsClient newsClient;
	
	@Autowired
	LatiLongiClient latiLongiClient;
	
	@RequestMapping("/show")
	public String show() {		
		return "Location";
	}
	
	@GetMapping("/showLatiLong")
	public String showWeather(@RequestParam("location") String loc,ModelMap modelMap)
	{
		Location location=new Location();
		try {
			location = latiLongiClient.JsonStringToObject(loc);
			MausamJankari mj=weatherClient.JsonStringToObject(location.getFeatures()[0].getCenter()[1],location.getFeatures()[0].getCenter()[0]);
			modelMap.addAttribute("mj", mj);
			modelMap.addAttribute("loc", location);
			String msg="The Climate of "+location.getFeatures()[0].getPlace_name()+" is "+mj.getCurrently().getSummary()+" and the temperature is "+mj.getCurrently().getTemperature();
			modelMap.addAttribute("msg", msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Location";
	}
	
	@GetMapping("/news")
	public String showNews(ModelMap modelMap) throws JsonSyntaxException, IOException
	{
		News news=new News();
		news=newsClient.JsonStringToObject();
		modelMap.addAttribute("news", news);
		return "showNews";
	}
	
}

