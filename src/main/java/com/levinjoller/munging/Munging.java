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
public final class Munging {

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

        int day = Integer.parseInt(row.substring(dayStart, dayEnd));
        int max = Integer.parseInt(row.substring(maxStart, maxEnd));
        int min = Integer.parseInt(row.substring(minStart, minEnd));

        Weather w = new Weather();
        w.setDay(day);
        w.setMaxTemp(max);
        w.setMinTemp(min);
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
        final int firstRow = 2;

        try {
            List<String> listWeather = Files.readAllLines(Paths.get(path));
            for (int i = 0; i < 2; i++) {
                String row = listWeather.get(i + firstRow);
                result.add(toWeather(row));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
