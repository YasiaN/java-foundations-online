package ru.itsjava.git;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.object.Person;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс Person должен: ")
public class PersonTest {
    public static final String DEFAULT_NAME = "ron";
    public static final int DEFAULT_AGE = 22;
    public static final int NEW_AGE = 30;

    //Проверяем метод-коструктор:
    @DisplayName("Корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Person ron = new Person(DEFAULT_NAME, DEFAULT_AGE);
        assertEquals(DEFAULT_NAME, ron.getName());
        assertEquals(DEFAULT_AGE, ron.getAge());
    }
// можно сравнить с использованием  assertAll (это более эффективно+можно сразу проверить 2 значения, даже если какое-то из них failed):
//        assertAll("ron", () -> assertEquals(DEFAULT_NAME, ron.getName()),
//                () -> assertEquals(DEFAULT_AGE, ron.getAge()));

    //Проверяем метод Get и Set:
    @DisplayName("Корректно заменять (обновлять) значения Age у конструктора")
    @Test
    public void shouldUpdateAgeCorrectly() {
        Person person1 = new Person(DEFAULT_NAME, DEFAULT_AGE);
        person1.setAge(NEW_AGE);
        assertEquals(NEW_AGE, person1.getAge());
    }
//    Проверяем метод ToString:

    @DisplayName("корректно выводится в строку: ")
    @Test
    public void shouldBeCorrectInToString() {
        Person person_2 = new Person(DEFAULT_NAME, DEFAULT_AGE);
        assertEquals("Person(name=" + person_2.getName() + ", age=" + person_2.getAge() + ")", person_2.toString());
    }

// Проверяем метод Equals и Hashcode

    @DisplayName("проверяем что равенство работает корректно: ")
    @Test
    public void shouldCheckEqualityCorrectly() {
        Person mary = new Person("mary", 22);
        Person mary2 = new Person("mary2", 22);

        assertEquals(false, mary.equals(mary2));
        assertEquals(true, mary.equals(mary));
    }

    // проверяем, что birthday () работает корректно

    @DisplayName("проверяем что прибавление 1 года работает верно")
    @Test
    public void shouldCheckAddingOneYearWorksCorrectly() {
        Person clark = new Person("clark", 19);
        clark.birthday();
        assertEquals(20, clark.getAge());
    }

    // проверяем, что takeBeer работает корректно
    @DisplayName("проверяем, что takeBeer работает корректно: если больше 18, то true если else, то false ")
    @Test

    public void сheckIfTheAgeIsLessOrBiggerThan18() {
        Person charly = new Person("charly", 10);
        assertFalse(charly.takeBeer());

        Person lena = new Person("lena", 65);
        assertTrue(lena.takeBeer());

    }
}
