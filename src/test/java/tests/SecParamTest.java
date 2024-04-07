package tests;

import models.People;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SecParamTest {

    private static Stream<Arguments> testPeople(){
        return Stream.of(
                Arguments.of(new People("Stas", 18,"male")),
                Arguments.of(new People("Sasha", 20,"female")),
                Arguments.of(new People("Misha", 15,"male"))

        );
    }
    @ParameterizedTest
    @MethodSource("testPeople")

    public void testParamPeople(People people){
        System.out.println(people.getName() + " " + people.getAge() + " " + people.getGender());
        Assertions.assertTrue(people.getName().contains("s"));

    }


}
