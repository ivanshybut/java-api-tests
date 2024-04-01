package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class FirstTest {

    private String name;
    @BeforeEach

    public void before(){
        name = "Name is " + LocalDateTime.now();
        System.out.println(name);
    }

    @AfterEach
    public void after(){
        System.out.println("Test end");
    }

    @Test
    public void testTwoLessThanThree(){
        int a = 2;
        int b = 3;
        Assertions.assertTrue(a<b, "Число " + a + " больше числа " + b);

    }

    @Test
    public void testTwoPlusTwoEqualFour(){
        Assertions.assertEquals(4, 2 +2);
    }

    @Test
    public void testOnePlusThreeEqualFour(){
        Assertions.assertEquals(4, 1+3);
    }

    @Test
    public void testZeroPlusFourEqualFour(){
        Assertions.assertEquals(4, 0 + 4);
    }
}
