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

    @Test
    public void getResultShouldReturn1() {
        String expected = "1";
        String actual = FizzBuzz.getResult();
        assertEquals(expected, actual);
    }
}
