package junit5.api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class SimpleApiTest {

    @Test
    public void getAllUserTest(){
        given().get("https://fakestoreapi.com/users");
    }



}
