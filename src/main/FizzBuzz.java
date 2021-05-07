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
        final int MULTIPLIER_THREE = 3;
        if (number % MULTIPLIER_THREE == 0) {
            return "Fizz";
        } else {
            return String.valueOf(number);
        }
    }
}
