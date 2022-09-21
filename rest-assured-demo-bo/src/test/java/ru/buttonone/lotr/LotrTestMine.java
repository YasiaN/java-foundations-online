package ru.buttonone.lotr;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.buttonone.model.Book;
import ru.buttonone.model.Chapter;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

@DisplayName("C API властелина колец должны")
public class LotrTestMine {

    public static final String LOTR_API_URL = "https://the-one-api.dev/v2";
    public static final String LOTR_API_CHAPTERS_URL = "https://the-one-api.dev/v2/book/";

    @DisplayName("корретно получать книги")
    @Test
    public void shouldHaveCorrectGetBooksTest () {
        ValidatableResponse validatableResponse = given()
                .baseUri(LOTR_API_URL)
                .when()
                .get("/book")

                .then()
                .statusCode(200);

        List<Book> bookList = validatableResponse
                .extract()
                .body()
                .jsonPath().getList("docs", Book.class);
        System.out.println(bookList);
    }
// 1.       Assertions.assertEquals(3,bookList.size());


// 2.               .log().all()
//                .statusCode(200);
//3.
//        assertThat(bookList, hasItem(new Book ("The Fellowship Of The Ring")));

//  3. Написать тест: Получить список глав книги и проверить корректность этого списка (содержимое)

        @DisplayName("корректно получить список глав книги")
        @Test
        public void shouldHaveCorrectGetChapter1Test() {
            ValidatableResponse validatableResponseForChapters = given()
                    .baseUri(LOTR_API_CHAPTERS_URL)
                    .when()
                    .get("5cf5805fb53e011a64671582/chapter")

                    .then()
                    .statusCode(200);
// Получить список глав книги и проверить корректность этого списка (содержимое)

        List <Chapter> chapterList = validatableResponseForChapters
                .extract()
                .body()
                .jsonPath().getList("docs",Chapter.class);
            System.out.println(chapterList);

//         проверить корректность этого списка (содержимое)
            MatcherAssert.assertThat(chapterList, Matchers.containsInAnyOrder(new Chapter
                    ("A Long-expected Party","The Shadow of the Past","Three is Company","A Short Cut to Mushrooms","A Conspiracy Unmasked"
                            "The Old Forest","In the House of Tom Bombadil", "Fog on the Barrow-Downs","At the Sign of The Prancing Pony"
                    , "Strider","A Knife in the Dark","Flight to the Ford","Many Meetings","The Council of Elrond","The Ring Goes South","A Journey in the Dark",
                            "The Bridge of Khazad-dûm","Lothlórien", "The Mirror of Galadriel","Farewell to Lórien","The Great River",
                            "The Breaking of the Fellowship")));

        }


    }

