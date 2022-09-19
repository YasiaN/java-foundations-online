package ru.buttonone.numbers;

import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.buttonone.numbers.specification.NumbersSpecifications;

import static io.restassured.RestAssured.given;

public class NumbersTest {

    public static final String NUMBERS_URL = "http://numbersapi.com";
    public static final String ID_PATH = "/{id}";


    @Test
    public void shouldHaveCorrectGet2() {

//        Response response =RestAssured.given().get("http://numbersapi.com/2");
//        response.prettyPrint();
//        System.out.println(response.statusCode());

//        Assertions.assertEquals(200,response.statusCode());

//        RequestSpecification requestSpecification =
//                new RequestSpecBuilder()
//                        .addHeader("Accept-Language", "ru")
//                        .setBaseUri(NUMBERS_URL)
//                        .build();

//        ResponseSpecification responseSpecification =
//                new ResponseSpecBuilder()
//                        .log(LogDetail.ALL)
//                        .expectStatusCode(200)
//                        .build();

        given()
                .spec(new NumbersSpecifications().defaultRequestSpecification())
                .when()
                .get()
                .then()
//                .log().all()
//                .statusCode(200);
                .spec(new NumbersSpecifications().defaultResponseSpecificationWithoutExpectContentType());



        given()
                .spec(new NumbersSpecifications().defaultRequestSpecification())
                .when()
                .get()
                .then()
//                .log().all()
//                .statusCode(200);
        .spec(new NumbersSpecifications().defaultResponseSpecificationWithoutExpectContentType());

        given()
                .baseUri(NUMBERS_URL)
                .when()
                .param("id", 2)
                .get("/2")
                .then()
//                .contentType(ContentType.TEXT)
//                .log().all()
//                .statusCode(200);
                .spec(new NumbersSpecifications().defaultResponseSpecification());

    }

    @DisplayName("Проверяем, что при вводе числа выдаёт ответ и ответ релевантен ")
    @Test
    public void shouldHaveCorrectGet8() {

//        given
//         Response response = RestAssured.given().get("http://numbersapi.com/8/math");
//        response.prettyPrint();

        RestAssured
                .given()
//                .header(new Header("language", "en"))
//                .baseUri(NUMBERS_URL)
                .spec (new NumbersSpecifications().defaultRequestSpecification())
                .when()
                .get("8/math")
                .then()
//                .log().all()
//                .contentType(ContentType.TEXT)
//                .statusCode(200);
                .spec(new NumbersSpecifications().defaultResponseSpecification());
    }

    @DisplayName("Проверяем, что при вводе даты выдаёт ответ и ответ релевантен")
    @Test
    public void shouldHaveCorrectDate27Aug() {

        RestAssured
                .given()
//                .header(new Header("language", "eng"))
//                .baseUri(NUMBERS_URL)
                .spec(new NumbersSpecifications().defaultRequestSpecification())
                .pathParam("id",8/27)
                .when()
                .get(ID_PATH)
                .then()
//                .log().all()
//                .statusCode(200)
//                .contentType(ContentType.TEXT);
                .spec(new NumbersSpecifications().defaultResponseSpecification());


    }
}
