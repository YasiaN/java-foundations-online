package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.Data;

// Создать класс Книга (C полями: Название, Автор, количество страниц)
@AllArgsConstructor
@Data
public class Book {

    private final String name;
    private final String author;
    private final int quantityOfPages;

}
