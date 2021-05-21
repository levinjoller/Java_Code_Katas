package com.levinjoller.munging;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Main class for the Data-Munging kata.
 * 
 * @author Levin Joller
 * @since 2021-05-12
 * @version 1.0.0
 */
public class Munging {

	/**
	 * Convert string to Weather object.
	 * 
	 * @param row
	 * @return weather object.
	 */
	private static Weather toWeather(String row) {
		Weather w = new Weather();
		w.day = Integer.parseInt(row.substring(3, 4));
		w.maxTemp = Integer.parseInt(row.substring(6, 8));
		w.minTemp = Integer.parseInt(row.substring(12, 14));
		return w;
	}

	/**
	 * Get data out of file.
	 * 
	 * @return List of Weather data
	 */
	public static List<Weather> getWeather() {
		String path = "./src/main/resources/weather.dat";
		List<Weather> result = new ArrayList<Weather>();
		try {
			List<String> listWeather = Files.readAllLines(Paths.get(path));
			String thirdRow = listWeather.get(2);
			result.add(toWeather(thirdRow));
			String secondRow = listWeather.get(3);
			result.add(toWeather(secondRow));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}