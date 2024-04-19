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
        FileInputStream fs = new FileInputStream("/Users/ivanshybut/java-api-tests/JavaApiTests/src/test/resources/project.properties");
        properties.load(fs);

        String url = properties.getProperty("url");
        boolean isProduction = Boolean.parseBoolean(properties.getProperty("is_production"));
        int threads = Integer.parseInt(properties.getProperty("threads"));

        System.out.println(url);
        System.out.println(isProduction);
        System.out.println(threads);

    }
}
