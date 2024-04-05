package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ParamTestSec {
    @ParameterizedTest
    @CsvFileSource(resources = "/people.csv", delimiter = ',')
    public void paramTest(String name, Integer age, String gender){
        System.out.println(name + " " + age + " " + gender);

    }
}
