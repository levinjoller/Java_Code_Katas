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
        List<Weather> weathers = Munging.getWeather();
        assertEquals(day, weathers.get(0).getDay());
        assertEquals(max, weathers.get(0).getMaxTemp());
        assertEquals(min, weathers.get(0).getMinTemp());
    }

    /** Return second weather data entry in file. */
    @Test
    public void getWeatherSecondRow() {
        final int day = 2;
        final int max = 79;
        final int min = 63;
        List<Weather> weathers = Munging.getWeather();
        assertEquals(day, weathers.get(1).getDay());
        assertEquals(max, weathers.get(1).getMaxTemp());
        assertEquals(min, weathers.get(1).getMinTemp());
    }

    @Test
    public void getWeatherTenthRow() {
        final int day = 10;
        final int max = 84;
        final int min = 64;
        List<Weather> weathers = Munging.getWeather();
        assertEquals(day, weathers.get(9).getDay());
        assertEquals(max, weathers.get(9).getMaxTemp());
        assertEquals(min, weathers.get(9).getMinTemp());
    }
}
