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
	 * Default constructor.
	 */
	private Munging() {
		throw new IllegalStateException();
	}

	/**
	 * Convert string to Weather object.
	 *
	 * @param row
	 * @return weather object.
	 */
	private static Weather toWeather(final String row) {
		final int dayStart = 3;
		final int dayEnd = 4;
		final int maxStart = 6;
		final int maxEnd = 8;
		final int minStart = 12;
		final int minEnd = 14;

		Weather w = new Weather();

		w.setDay(Integer.parseInt(row.substring(dayStart, dayEnd)));
		w.setMaxTemp(Integer.parseInt(row.substring(maxStart, maxEnd)));
		w.setDay(Integer.parseInt(row.substring(minStart, minEnd)));
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
		final int dayOne = 2;
		final int dayTwo = 3;
		try {
			List<String> listWeather = Files.readAllLines(Paths.get(path));
			String thirdRow = listWeather.get(dayOne);
			result.add(toWeather(thirdRow));
			String secondRow = listWeather.get(dayTwo);
			result.add(toWeather(secondRow));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
