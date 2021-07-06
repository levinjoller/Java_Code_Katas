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
 * @version 1.0.0
 * @since 2021-05-12
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
        String exclude = "[\\s\\*]";
        final int dayMaxMin = 3;
        Stream<String> columns = Stream.of(row.split(exclude));
        Stream<String> digits = columns.filter(w -> !w.isEmpty())
                .limit(dayMaxMin);
        List<String> data = digits.collect(Collectors.toList());

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
     * @return list of Weather data
     */
    public static List<Weather> getWeather() {
        String path = "./src/main/resources/weather.dat";
        List<Weather> result = new ArrayList<>();
        final int startIndex = 2;

        try {
            List<String> weathers = Files.readAllLines(Paths.get(path));
            // Remove header
            weathers = weathers.subList(startIndex, weathers.size());
            weathers.forEach(w -> result.add(toWeather(w)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * Get weather with largest temperature spread.
     * 
     * @param weathers
     * @return largest temperature spread
     */
    public static Weather getLagestSpread(List<Weather> weathers) {
        Weather result = weathers.get(0);

        for (Weather weather : weathers) {
            if (weather.getTempSpread() > result.getTempSpread()) {
                result = weather;
            }
        }

        return result;
    }
}
