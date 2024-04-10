package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.People;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class JacksonTest025 {
    @Test
    public void jacksonTest() throws IOException {
        // из json в обьект
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/test/resources/stas.json");
        People people = objectMapper.readValue(file, People.class);
        System.out.println(people.getName());
        System.out.println(people.getAge());
        System.out.println(people.getGender());

//из объект в json
        People sasha = new People("sasha", 10, "female");
        String json = objectMapper.writeValueAsString(sasha);
        System.out.println(json );

    }
}
