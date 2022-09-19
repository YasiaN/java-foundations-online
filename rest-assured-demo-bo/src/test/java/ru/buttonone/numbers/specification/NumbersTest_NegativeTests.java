package ru.buttonone.numbers.specification;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class NumbersTest_NegativeTests {


    @Test
    @DisplayName("При вводе английских букв после / -> появляется 404 ошибка")

    public void shouldGet404errorInCaseEnterLetter () {
        
        given()
                .spec (new NumbersSpecifications().defaultRequestSpecification())
                .when()
                .get("/h")
                .then()
                .spec (new NumbersSpecifications().defaultResponseSpecificationWithStatusCodeChangedTo404());
        

    }


    @Test
    @DisplayName("При вводе символа восклицательного знака  появляется 404 ошибка")

    public void shouldGet404errorInCaseEnterExclamationPoint () {

        given()
                .spec (new NumbersSpecifications().defaultRequestSpecification())
                .when()
                .get("/!")
                .then()
                .spec (new NumbersSpecifications().defaultResponseSpecificationWithStatusCodeChangedTo404())
                ;


    }





}
