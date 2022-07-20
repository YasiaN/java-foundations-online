package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Book;
import ru.itsjava.domain.Client;

import java.util.Scanner;

@RequiredArgsConstructor
public class ClientServiceImpl implements  ClientService{
    private final Client client;
    private final Scanner scanner;
    private final BookService bookService;

    @Override
    public void buyBook() {
        System.out.println("Введите название книги");
        Scanner scan = new Scanner (System.in);
        String title = scanner.next();
        if (bookService.hasBook(title)) {
            System.out.println("Покупаем книгу...");
            bookService.takeBookByName(title);
            System.out.println("Вы купили книгу "+title + ". Спасибо!");
        }
        else {
            System.out.println("Не смогли купить книгу.... Такой книги нет. ");
        }

    }

    @Override
    public void putBook() {
        System.out.println("Введите название книги");
        String title = scanner.next();

        System.out.println("Введите автора книги");
        String author = scanner.next();

        Book book = new Book (title, author);
        bookService.putBook(book);
    }

    @Override
    public void printBooks() {
        System.out.println("Уважаемый "+ client.getName());
        System.out.println("Вот наши книги: ");

    }
}
