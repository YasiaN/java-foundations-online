package ru.buttonone.lotr;

import io.restassured.response.ValidatableResponse;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.buttonone.model.Book;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("C API властелина колец должны")
public class LotrTest {

    public static final String LOTR_API_URL = "https://the-one-api.dev/v2";

    @DisplayName("корректно получать книги")
    @Test
    public void shouldHaveCorrectGetBooksTest() {
        ValidatableResponse validatableResponse = given()
                .baseUri(LOTR_API_URL)
                .when()
                .get("/book")
                .then();
//                .log().all()
//                .statusCode(200);

        List<Book> bookList = validatableResponse.extract().body().jsonPath().getList("docs", Book.class);
        System.out.println("bookList = " + bookList);
//        Assertions.assertAll(
//                () -> assertTrue(bookList.stream().anyMatch(b -> b.getName().equals("The Fellowship Of The Ring"))
//                ));

        MatcherAssert.assertThat(bookList, Matchers.containsInAnyOrder(new Book("The Fellowship Of The Ring") ,
                new Book ("The Two Towers"),
                new Book ("The Return Of The King"),


    }
}
