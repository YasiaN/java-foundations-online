package ru.itsjava.services;

import ru.itsjava.domain.Book;

public interface BookService {
        Book takeBookByName (String name); // взять книгу
        void putBook (Book book);  // положить книгу
        boolean hasBook (String name); // проверить наличие книги
    void printBooks();
    }
