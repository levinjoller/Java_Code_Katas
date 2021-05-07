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
     * Return a normal number.
     */
    @Test
    public void passNoMultipleOfThreeOrFiveReturnNumber() {
        String expected = "1";
        String actual = FizzBuzz.getResult(1);
        assertEquals(expected, actual);
    }

    /**
     * Return Fizz for multiple of three.
     */
    @Test
    public void passMultipleOfThreeReturnFizz() {
        String expected = "Fizz";
        int currentMultiplier = 3;
        String actual = FizzBuzz.getResult(currentMultiplier);
        assertEquals(expected, actual);
    }
}
