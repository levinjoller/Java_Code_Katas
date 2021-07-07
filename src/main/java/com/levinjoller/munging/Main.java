package com.levinjoller.munging;

import java.util.List;

/**
 * Return smallest temperature spread of all days.
 *
 * @author Levin Joller
 * @version 1.0.0
 * @since 2021-07-07
 */
public final class Main {

    /**
     * Default constructor.
     */
    private Main() {
        throw new IllegalStateException();
    }

    /**
     * Output the day information in the console as a table.
     *
     * @param args
     */
    public static void main(final String[] args) {
        List<Weather> weathers = Munging.getWeather();
        Weather smallest = Munging.getSmallestSpread(weathers);

        System.out.printf("%-5s %-5s %-5s%n", "Day", "Max", "Min");
        System.out.printf("%-5s %-5s %-5s%n", smallest.getDay(),
                smallest.getMaxTemp(), smallest.getMinTemp());
    }
}
