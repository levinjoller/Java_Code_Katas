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
        final String day = "1";
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
        final String day = "2";
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
        final String day = "10";
        final int max = 84;
        final int min = 64;
        final int row = 9;
        List<Weather> weathers = Munging.getWeather();
        assertEquals(day, weathers.get(row).getDay());
        assertEquals(max, weathers.get(row).getMaxTemp());
        assertEquals(min, weathers.get(row).getMinTemp());
    }

    /** Return last weather data entry in file with alphabetic day. */
    @Test
    public void getWeatherLastRowWithAlphabiticalDay() {
        final String day = "mo";
        final double max = 82.9;
        final double min = 60.5;
        final int row = 30;
        List<Weather> weathers = Munging.getWeather();
        assertEquals(day, weathers.get(row).getDay());
        assertEquals(max, weathers.get(row).getMaxTemp());
        assertEquals(min, weathers.get(row).getMinTemp());
    }

    /** Return temperature spread of first day. */
    @Test
    public void getTemperatureSpreadOfFirstDay() {
        final double max = 88;
        final double min = 59;
        final double spread = max - min;
        final int row = 0;
        List<Weather> weathers = Munging.getWeather();
        assertEquals(spread, weathers.get(row).getTempSpread());
    }

    /** Return the largest temperature spread in the list. */
    @Test
    public void getLargestTeparatureSpread() {
        final String day = "9";
        final double max = 86;
        final double min = 32;
        final double spread = max - min;
        List<Weather> weathers = Munging.getWeather();
        Weather actual = Munging.getLargestSpread(weathers);

        assertEquals(day, actual.getDay());
        assertEquals(spread, actual.getTempSpread());
    }
}
