/**
 * The FizzBuzz game class
 *
 * @author Levin Joller
 * @version 1.0
 * @since 2021-05-04
 */

package com.levinjoller;

public final class FizzBuzz {

    /** Number three. */
    private static final int THREE = 3;

    /** Number five. */
    private static final int FIVE = 5;

    /** Name for a multiple of three. */
    private static final String MULTIPLE_TREE = "Fizz";

    /** Name for a multiple of five. */
    private static final String MULTIPLE_FIVE = "Buzz";

    private FizzBuzz() {
        throw new IllegalStateException();
    }

    /**
     * This methods determines if a number is a multiple of three, five or both.
     *
     * @param number to be checked.
     * @return number, "Fizz", "Buzz" or "FizzBuzz".
     */
    public static String getResult(final int number) {
        boolean isMultipleOfThree = (number % THREE == 0);
        boolean isMultipleOfFive = (number % FIVE == 0);
        String result = String.valueOf(number);

        if (isMultipleOfThree) {
            result = MULTIPLE_TREE;
        }
        if (isMultipleOfFive) {
            result = MULTIPLE_FIVE;
        }
        if (isMultipleOfThree && isMultipleOfFive) {
            result = MULTIPLE_TREE + MULTIPLE_FIVE;
        }
        return result;
    }
}
