package com.srijan.weather.integration;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.srijan.weather.entities.MausamJankari;
import com.srijan.weather.newsEntity.News;

@Component
public class NewsClient {

	public static String readStringFromURL() throws IOException {
		try (Scanner scanner = new Scanner(
				new URL("https://newsapi.org/v2/top-headlines?country=in&apiKey=461dcf3d5e06492c8464d96741e80200")
						.openStream(),
				StandardCharsets.UTF_8.toString())) {
			scanner.useDelimiter("\\A");
			return scanner.hasNext() ? scanner.next() : "";
		}
	}

	public News JsonStringToObject() throws JsonSyntaxException, IOException {
		// System.out.println(urlToJsonString());
		Gson gson = new Gson();
		News news = gson.fromJson(readStringFromURL(), News.class);
		// System.out.println(mj);
		return news;
	}
}
