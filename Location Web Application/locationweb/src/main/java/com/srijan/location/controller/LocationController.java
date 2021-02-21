package com.srijan.location.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.srijan.location.model.Location;
import com.srijan.location.repos.LocationRepository;
import com.srijan.location.service.LocationServices;
import com.srijan.location.util.EmailUtil;
import com.srijan.location.util.ReportUtil;

@Controller
public class LocationController {

	@Autowired
	LocationServices services;
	
	@Autowired
	EmailUtil emailUtil;
	
	@Autowired
	LocationRepository repos;
	
	@Autowired
	ReportUtil reportUtil;
	
	@Autowired
	ServletContext sc;
	
	@RequestMapping("/showCreate")
	public String showCreate()
	{
		return "createLocation";
	}
	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location,ModelMap modelMap)
	{
		Location locationSaved=services.saveLocation(location);
		String msg="Location saved with id:"+locationSaved.getId();
		modelMap.addAttribute("msg", msg);
		//emailUtil.sendEmail("ultimate.gamecentric@gmail.com", "Location Saved", "Location saved successfully thanks!!!");
		return "createLocation";
	}
	
	@RequestMapping("/displayLocations")
	public String showLocations(ModelMap modelMap)
	{
		List<Location> locations=services.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id,ModelMap modelMap)
	{
		Location location=(Location) services.getLocationById(id);
		services.deleteLocation(location);
		List<Location> locations=services.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id,ModelMap modelMap)
	{
		Location location=services.getLocationById(id);
		modelMap.addAttribute("location", location);
		return "editLocation";
	}
	
	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location,ModelMap modelMap)
	{
		services.updateLocation(location);
		List<Location> locations=services.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}
	
	@RequestMapping("/generateReport")
	public String generateReport()
	{
		String path = sc.getRealPath("/");
		List<Object[]> data = repos.findTypeAndTypeCount();
		reportUtil.generatePieChart(path, data);
		return "report";
		
	}
	
}
