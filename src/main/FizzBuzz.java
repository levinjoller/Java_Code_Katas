/**
 * The FizzBuzz method getResult returns a number, Fizz (%3 == 0),
 * Buzz (%5 == 0) or FizzBuzz ((%3 && %5) == 0).
 *
 * @author Levin Joller
 * @version 1.0
 * @since 2021-05-04
 */

package main;

public final class FizzBuzz {

    /** Number three as a multiplier. */
    private static final int MULTIPLIER_THREE = 3;

    /** Number five as a multiplier. */
    private static final int MULTIPLIER_FIVE = 5;

    private FizzBuzz() {
        throw new IllegalStateException();
    }

    /**
     * This methods determines if a number is a multiple of three, five or both.
     *
     * @param number number to check.
     * @return String; Returns a number, Fizz, Buzz or FizzBuzz.
     */
    public static String getResult(final int number) {
        boolean isMultipleOfThree = (number % MULTIPLIER_THREE == 0);
        boolean isMultipleOfFive = (number % MULTIPLIER_FIVE == 0);

        if (isMultipleOfThree) {
            return "Fizz";
        }
        if (isMultipleOfFive) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
