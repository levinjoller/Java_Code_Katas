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
	 * @param day
	 */
	public void setDay(final int day) {
		this.day = day;
	}

	/**
	 * @return mayTemp
	 */
	public int getMaxTemp() {
		return maxTemp;
	}

	/**
	 * @param maxTemp
	 */
	public void setMaxTemp(final int maxTemp) {
		this.maxTemp = maxTemp;
	}

	/**
	 * @return minTemp
	 */
	public int getMinTemp() {
		return minTemp;
	}

	/**
	 * @param minTemp
	 */
	public void setMinTemp(final int minTemp) {
		this.minTemp = minTemp;
	}
}
