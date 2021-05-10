/**
 * The FizzBuzzTest class provides unit tests for the FizzBuzz class.
 *
 * @author Levin Joller
 * @version 1.0
 * @since 2021-05-04
 */

package com.levinjoller.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    /** Name for a multiple of three. */
    private static final String MULTIPLE_THREE = "Fizz";

    /** Name for a multiple of five. */
    private static final String MULTIPLE_FIVE = "Buzz";

    /** Return the parameter one. */
    @Test
    public void getResultPassOneReturnOne() {
        String expected = "1";
        String actual = FizzBuzz.getResult(1);
        assertEquals(expected, actual);
    }

    /** Return "Fizz" for the number three. */
    @Test
    public void getResultPassThreeReturnFizz() {
        final int number = 3;
        String expected = MULTIPLE_THREE;
        String actual = FizzBuzz.getResult(number);
        assertEquals(expected, actual);
    }

    /** Return "Buzz" for the number five. */
    @Test
    public void getResultPassFiveReturnBuzz() {
        final int number = 5;
        String expected = MULTIPLE_FIVE;
        String actual = FizzBuzz.getResult(number);
        assertEquals(expected, actual);
    }

    /** Return "FizzBuzz" for the number fifteen. */
    @Test
    public void getResultPassFifteenReturnFizzBuzz() {
        final int number = 15;
        String expected = MULTIPLE_THREE + MULTIPLE_FIVE;
        String actual = FizzBuzz.getResult(number);
        assertEquals(expected, actual);
    }
}
