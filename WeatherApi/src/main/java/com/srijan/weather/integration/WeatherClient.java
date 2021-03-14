package com.srijan.weather.integration;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import org.springframework.stereotype.Component;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.srijan.weather.entities.MausamJankari;

@Component
public class WeatherClient {

	public static String readStringFromURL(String lati, String longi) throws IOException {
		try (Scanner scanner = new Scanner(
				new URL("https://api.darksky.net/forecast/ca85427b7d0a7a79baaf9c259c5ae1f3/" + lati + ",%20" + longi+"?lan=en&units=si")
						.openStream(),
				StandardCharsets.UTF_8.toString())) {
			scanner.useDelimiter("\\A");
			return scanner.hasNext() ? scanner.next() : "";
		}
	}

	public MausamJankari JsonStringToObject(String lati, String longi) throws JsonSyntaxException, IOException {
		// System.out.println(urlToJsonString());
		Gson gson = new Gson();
		MausamJankari mj = gson.fromJson(readStringFromURL(lati, longi), MausamJankari.class);
		// System.out.println(mj);
		return mj;
	}
}
