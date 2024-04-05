package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedTests {
    @ParameterizedTest
    @CsvSource({"Stas, 18, male", "Sasha, 20, female", "Misha, 15, male"})
    public void testTwoPlusTwoEqualFour(String name, String age, String gender){
        System.out.println(name + " " + age + " " + gender);
        Assertions.assertTrue(name.contains("s"));
    }


}
