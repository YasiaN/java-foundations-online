package ru.buttonone.numbers;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class NumbersTest {

    public static final String NUMBERS_URL = "http://numbersapi.com/";


    @Test
    public void shouldHaveCorrectGet2() {

//        Response response =RestAssured.given().get("http://numbersapi.com/2");
//        response.prettyPrint();
//        System.out.println(response.statusCode());

//        Assertions.assertEquals(200,response.statusCode());

        RequestSpecification requestSpecification =
                new RequestSpecBuilder()
                        .addHeader("Accept-Language", "ru")
                        .setBaseUri(NUMBERS_URL)
                        .build();

        given()
                .spec(requestSpecification)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200);

        ResponseSpecification responseSpecification =
                new ResponseSpecBuilder()
                        .log(LogDetail.ALL)
                        .expectStatusCode(200)
                        .build();

        given()
                .spec(requestSpecification)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200);


        given()
                .baseUri(NUMBERS_URL)
                .when()
                .param("id", 2)
                .get("/2")
                .then()
                .contentType(ContentType.TEXT)
                .log().all()
                .statusCode(200);
        .spec(responseSpecification);
    }

    @DisplayName("Проверяем, что при вводе числа выдаёт ответ и ответ релевантен ")
    @Test
    public void shouldHaveCorrectGet8() {

//        given
//         Response response = RestAssured.given().get("http://numbersapi.com/8/math");
//        response.prettyPrint();

        given()
                .baseUri("http://numbersapi.com/8")
                .when()
                .get("/math")
                .then()
                .log().all()
                .statusCode(200);
    }

    @DisplayName("Проверяем, что при вводе даты выдаёт ответ и ответ релевантен")
    @Test
    public void shouldHaveCorrectDate27Aug() {

        given()
                .baseUri("http://numbersapi.com/")
                .when()
                .get("8/27/date")
                .then()
                .log().all()
                .statusCode(200)
                .contentType(ContentType.TEXT);


    }


}
