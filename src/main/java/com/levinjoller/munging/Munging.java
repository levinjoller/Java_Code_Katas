package com.levinjoller.munging;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        List<String> data = Stream.of(row.split("[\\s\\*]"))
                .filter(w -> !w.isEmpty()).limit(3)
                .collect(Collectors.toList());

        String day = data.get(0);
        double max = Double.parseDouble(data.get(1));
        double min = Double.parseDouble(data.get(2));

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
        List<Weather> result = new ArrayList<>();
        final int lastRow = 33;

        try {
            List<String> weathers = Files.readAllLines(Paths.get(path));
            for (int i = 2; i < lastRow; i++) {
                String row = weathers.get(i);
                result.add(toWeather(row));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
