package tests;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReaderTests {
    @Test
    @SneakyThrows
    public void simpleReaderTest() throws IOException {
        Properties properties = new Properties();
        FileInputStream fs = new FileInputStream("src/tests/resources/project.properties");
        properties.load(fs);


    }
}
