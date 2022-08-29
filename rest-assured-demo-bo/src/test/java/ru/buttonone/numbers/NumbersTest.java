package ru.buttonone.numbers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumbersTest {

    public static final String NUMBERS_URL = Numbers_URL;

    @Test
    public void shouldHaveCorrectGet2() {

//        Response response =RestAssured.given().get("http://numbersapi.com/2");
//        response.prettyPrint();
//        System.out.println(response.statusCode());

//        Assertions.assertEquals(200,response.statusCode());

        RestAssured
                .given()
                .baseUri( NUMBERS_URL)
                .when()
                .get("/2")
                .then ()
                .contentType(ContentType.TEXT)
                .log().all()
                .statusCode(200);

    }
}
