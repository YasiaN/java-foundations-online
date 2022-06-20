package ru.itsjava.git;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.Watch;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName(" Класс Watch должен: ")
public class WatchTest {

    private static final String DEFAULT_FIRM = "SEIKO";
    private static final String DEFAULT_AUTHOR = "Vova";
    private static final Double DEFAULT_PRICE = 10000.00;
    private static final String NEW_AUTHOR = "Masha";

    @DisplayName("корректно создаваться конструктором")
    @Test

    public void shouldHaveCorrectConstructor() {
        Watch actualWatch = new Watch(DEFAULT_FIRM, DEFAULT_AUTHOR, DEFAULT_PRICE);

        //тестим что конструктор работает верно. то есть что поля поменялись и равны SEICO, vova, 10000.00

//        assertEquals(DEFAULT_FIRM, actualWatch.getFirm());
//        assertEquals(DEFAULT_AUTHOR, actualWatch.getAuthor());
//        assertEquals(DEFAULT_PRICE, actualWatch.getPrice());
//       Assertions.assertTrue(actualWatch.getAuthor().contains("a"));

        assertAll("actualWatch", ()-> assertEquals(DEFAULT_FIRM,actualWatch.getFirm()),
                ()-> assertEquals(DEFAULT_AUTHOR,actualWatch.getAuthor()),
                ()-> assertEquals(DEFAULT_PRICE,actualWatch.getPrice()));
    }
    @DisplayName("корректно изменять автора")
    @Test
    // проверяем метод Set
    public void shouldHaveCorrectUpdateWatch() {
        Watch actualWatch = new Watch(DEFAULT_FIRM, DEFAULT_AUTHOR, DEFAULT_PRICE);
        actualWatch.setAuthor(NEW_AUTHOR);
        assertEquals(NEW_AUTHOR, actualWatch.getAuthor());
    }



}
