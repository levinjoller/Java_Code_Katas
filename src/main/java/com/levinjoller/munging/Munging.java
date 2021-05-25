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

        String daySub = row.substring(dayStart, dayEnd);
        String maxSub = row.substring(maxStart, maxEnd);
        String minSub = row.substring(minStart, minEnd);

        int day = Integer.parseInt(daySub);
        int max = Integer.parseInt(maxSub);
        int min = Integer.parseInt(minSub);

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
            List<String> Weathers = Files.readAllLines(Paths.get(path));
            for (int i = 0; i < 2; i++) {
                String row = Weathers.get(i + firstRow);
                result.add(toWeather(row));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
