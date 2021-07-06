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
    private String day;

    /** Max. temperature. */
    private double maxTemp;

    /** Min. temperature. */
    private double minTemp;

    /**
     * @return day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param dayIndex
     */
    public void setDay(final String dayIndex) {
        day = dayIndex;
    }

    /**
     * @return mayTemp
     */
    public double getMaxTemp() {
        return maxTemp;
    }

    /**
     * @param temp
     */
    public void setMaxTemp(final double temp) {
        maxTemp = temp;
    }

    /**
     * @return minTemp
     */
    public double getMinTemp() {
        return minTemp;
    }

    /**
     * @param temp
     */
    public void setMinTemp(final double temp) {
        minTemp = temp;
    }

    /**
     * @return temperature difference
     */
    public double getTempSpread() {
        return maxTemp - minTemp;
    }
}
