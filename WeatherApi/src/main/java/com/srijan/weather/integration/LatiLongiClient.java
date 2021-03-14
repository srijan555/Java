package com.srijan.weather.integration;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.srijan.weather.model.Location;

@Component
public class LatiLongiClient {

	public static String readStringFromURL(String location) throws IOException {
		try (Scanner scanner = new Scanner(
				new URL("https://api.mapbox.com/geocoding/v5/mapbox.places/"+location+".json?access_token=pk.eyJ1Ijoic3JpamFuNTU1IiwiYSI6ImNrNjdnM3d4OTA4MDYzbm16dWN3bmdjZmkifQ._1hlUsNRPeYOdNAW2fWPxw")
						.openStream(),
				StandardCharsets.UTF_8.toString())) {
			scanner.useDelimiter("\\A");
			return scanner.hasNext() ? scanner.next() : "";
		}
	}
	public Location JsonStringToObject(String location) throws JsonSyntaxException, IOException {
		System.out.println(readStringFromURL(location));
		Gson gson = new Gson();
		Location loc = gson.fromJson(readStringFromURL(location), Location.class);
		System.out.println(loc);
		return loc;
	}

}
