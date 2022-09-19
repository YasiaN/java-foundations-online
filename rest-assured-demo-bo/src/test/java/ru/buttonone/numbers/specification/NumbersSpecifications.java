package ru.buttonone.numbers.specification;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class NumbersSpecifications {
    public static final String NUMBERS_URL = "http://numbersapi.com";

    public RequestSpecification defaultRequestSpecification() {

        return new RequestSpecBuilder()
                .addHeader("language", "en")
                .setBaseUri(NUMBERS_URL)
                .build();
    }

    public ResponseSpecification defaultResponseSpecification() {
        return new ResponseSpecBuilder()
                .log(LogDetail.ALL)
                .expectStatusCode(200)
                .expectContentType(ContentType.TEXT)
                .build();

    }

    public ResponseSpecification defaultResponseSpecificationWithoutExpectContentType() {
        return new ResponseSpecBuilder()
               .log(LogDetail.ALL)
                .expectStatusCode(200)
                .build();
    }
    public ResponseSpecification defaultResponseSpecificationWithStatusCodeChangedTo404(){
        return new ResponseSpecBuilder()
                .log(LogDetail.ALL)
                .expectStatusCode(404)
                .build();

    }


}
