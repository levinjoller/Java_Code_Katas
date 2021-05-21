package com.levinjoller.munging;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

/**
 * Unit tests for the Munging class.
 * 
 * @author Levin Joller
 * @version 1.0.0
 * @since 2021-05-21
 */
public class MungingTest {

	/** Return first weather data entry in file. */
	@Test
	public void getWeatherFirstRow() {
		int day = 1;
		int max = 88;
		int min = 59;
		List<Weather> listWeather = Munging.getWeather();
		assertEquals(day, listWeather.get(0).day);
		assertEquals(min, listWeather.get(0).minTemp);
		assertEquals(max, listWeather.get(0).maxTemp);
	}

	/** Return second weather data entry in file. */
	@Test
	public void getWeatherSecondRow() {
		int day = 2;
		int max = 79;
		int min = 63;
		List<Weather> listWeather = Munging.getWeather();
		assertEquals(day, listWeather.get(1).day);
		assertEquals(min, listWeather.get(1).minTemp);
		assertEquals(max, listWeather.get(1).maxTemp);
	}
}
