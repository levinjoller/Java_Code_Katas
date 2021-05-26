package com.levinjoller.munging;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

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
        final int day = 1;
        final int max = 88;
        final int min = 59;
        final int row = 0;
        List<Weather> weathers = Munging.getWeather();
        assertEquals(day, weathers.get(row).getDay());
        assertEquals(max, weathers.get(row).getMaxTemp());
        assertEquals(min, weathers.get(row).getMinTemp());
    }

    /** Return second weather data entry in file. */
    @Test
    public void getWeatherSecondRow() {
        final int day = 2;
        final int max = 79;
        final int min = 63;
        final int row = 1;
        List<Weather> weathers = Munging.getWeather();
        assertEquals(day, weathers.get(row).getDay());
        assertEquals(max, weathers.get(row).getMaxTemp());
        assertEquals(min, weathers.get(row).getMinTemp());
    }

    /** Return tenth weather data entry in file. */
    @Test
    public void getWeatherTenthRow() {
        final int day = 10;
        final int max = 84;
        final int min = 64;
        final int row = 9;
        List<Weather> weathers = Munging.getWeather();
        assertEquals(day, weathers.get(row).getDay());
        assertEquals(max, weathers.get(row).getMaxTemp());
        assertEquals(min, weathers.get(row).getMinTemp());
    }
}
