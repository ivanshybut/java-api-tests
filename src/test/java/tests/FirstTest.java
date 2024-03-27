package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    public void testTwoLessThanThree(){
        int a = 2;
        int b = 3;
        Assertions.assertTrue(a<b, "Число " + a + " больше числа " + b);

    }
}
