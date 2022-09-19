package ru.buttonone.numbers;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.buttonone.numbers.specification.NumbersSpecifications;

import static io.restassured.RestAssured.given;

public class NumbersTest_Mine {

    public static final String NUMBERS_URL = "http://numbersapi.com";

    @Test
    public void shouldHaveCorrectGet2() {

//        Response response = RestAssured.given().get("http://numbersapi.com/2");
////        response.prettyPrint();
////        System.out.println("response.statusCode() = " + response.statusCode());
//        Assertions.assertEquals(200, response.statusCode());

//        RequestSpecification requestSpecification = new RequestSpecBuilder()
//                .addHeader("language", "en")
//                .setBaseUri(NUMBERS_URL)
//                .build();

//        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
//                .log(LogDetail.ALL)
//                .expectStatusCode(200)
//                .expectContentType(ContentType.TEXT)
//                .build();


        given()
                .spec(new NumbersSpecifications().defaultRequestSpecification())
                .when()
                .get("/2")
                .then()
                .spec(new NumbersSpecifications().defaultResponseSpecification()) ;


    }
}
