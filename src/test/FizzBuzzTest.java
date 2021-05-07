/**
 * The FizzBuzzTest is the test class for FizzBuzz.java.
 *
 * @author Levin Joller
 * @version 1.0
 * @since 2021-05-04
 */

package test;

import main.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    /** Result for a multiple of three. */
    private static final String MULTIPLE_THREE = "Fizz";

    /** Result for a multiple of five. */
    private static final String MULTIPLE_FIVE = "Buzz";

    /** Return a normal number. */
    @Test
    public void passNoMultipleOfThreeOrFiveReturnNumber() {
        String expected = "1";
        String actual = FizzBuzz.getResult(1);
        assertEquals(expected, actual);
    }

    /** Return Fizz for a multiple of three. */
    @Test
    public void passMultipleOfThreeReturnFizz() {
        final int number = 3;
        String expected = MULTIPLE_THREE;
        String actual = FizzBuzz.getResult(number);
        assertEquals(expected, actual);
    }

    /** Return Buzz for a multiple of five. */
    @Test
    public void passMultipleOfFiveReturnBuzz() {
        final int number = 5;
        String expected = MULTIPLE_FIVE;
        String actual = FizzBuzz.getResult(number);
        assertEquals(expected, actual);
    }
}
