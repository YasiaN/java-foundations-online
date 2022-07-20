package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Book;

import java.util.List;

@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final List<Book> booksFromStore;


    @Override
    public Book takeBookByName(String name) {
        Book resBook = null;

        for (Book book : booksFromStore
        ) {
            if (book.getTitle().equals(name)) {
                resBook = book;
            }

        }
        if (resBook != null) {
            booksFromStore.remove(resBook);

            return resBook;
        }
        return null;
    }


    @Override
    public void putBook(Book book) {
        booksFromStore.add(book);

    }

    @Override
    public boolean hasBook(String name) {
        for (Book book : booksFromStore
        ) {
            if (book.getTitle().equals(name)) {
                return true;
            }

        }
        return false;
    }

    @Override
    public void printBooks() {
        for (Book book:booksFromStore
             ) {
            System.out.println(book.getTitle()+" "+ book.getAuthor());


        }
    }
}
