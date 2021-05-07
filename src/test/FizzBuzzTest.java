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

    /**
     * Number three as a multiplier.
     */
    private static final int MULTIPLIER_THREE = 3;

    /**
     * Return a normal number.
     */
    @Test
    public void passNoMultipleOfThreeOrFiveReturnNumber() {
        String expected = "1";
        String actual = FizzBuzz.getResult(1);
        assertEquals(expected, actual);
    }

    /**
     * Return Fizz for a multiple of three.
     */
    @Test
    public void passMultipleOfThreeReturnFizz() {
        String expected = "Fizz";
        String actual = FizzBuzz.getResult(MULTIPLIER_THREE);
        assertEquals(expected, actual);
    }
}
