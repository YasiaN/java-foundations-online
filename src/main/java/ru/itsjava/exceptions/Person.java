package ru.itsjava.exceptions;

import lombok.Data;

@Data
// 1. Создать класс Person c полями String name и int age.
public class Person {
    private String name;
    private int age;

    //  создаём конструктор
    public Person(String name, int age) throws AgeNotValidException {
        this.name = name;
        this.age = age;

    }
}
