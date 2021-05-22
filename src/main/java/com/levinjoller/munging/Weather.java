package com.levinjoller.munging;

/**
 * Represent the weather of a day.
 *
 * @author Levin Joller
 * @version 1.0.0
 * @since 2021-05-21
 */
public class Weather {

    /** Index of the day. */
    private int day;

    /** Max. temperature. */
    private int maxTemp;

    /** Min. temperature. */
    private int minTemp;

    /**
     * @return day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param dayIndex
     */
    public void setDay(final int dayIndex) {
        day = dayIndex;
    }

    /**
     * @return mayTemp
     */
    public int getMaxTemp() {
        return maxTemp;
    }

    /**
     * @param temp
     */
    public void setMaxTemp(final int temp) {
        maxTemp = temp;
    }

    /**
     * @return minTemp
     */
    public int getMinTemp() {
        return minTemp;
    }

    /**
     * @param temp
     */
    public void setMinTemp(final int temp) {
        minTemp = temp;
    }
}
