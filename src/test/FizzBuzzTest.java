package test;

import main.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void getResult_return_1() {
        String expected = "1";
        String actual = FizzBuzz.getResult();
        assertEquals(expected, actual);
    }
}
