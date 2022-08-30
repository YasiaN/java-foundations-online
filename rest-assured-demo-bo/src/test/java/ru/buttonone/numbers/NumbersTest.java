package ru.buttonone.numbers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumbersTest {

    public static final String NUMBERS_URL = "Numbers_URL";

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

    @DisplayName("Проверяем, что при вводе числа выдаёт ответ и ответ релевантен ")
    @Test
    public void shouldHaveCorrectGet8 () {

       //given
//        Response response = RestAssured.given().get("http://numbersapi.com/8/math");
//        response.prettyPrint();

        RestAssured
                .given()
                .baseUri("http://numbersapi.com/8")
                .when()
                .get("/math")
                .then()
                .log().all()
                .statusCode(200);
            }

    @DisplayName("Проверяем, что при вводе даты выдаёт ответ и ответ релевантен")
    @Test
    public void shouldHaveCorrectDate27Aug () {

        RestAssured
                .given()
                .baseUri("http://numbersapi.com/")
                .when()
                .get("8/27/date")
                .then()
                .log().all()
                .statusCode(200)
                .contentType(ContentType.TEXT);


    }




}
