package ru.itsjava.services;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService{
    private final ClientService clientService;
    private final Scanner scanner;


    @Override
    public void menu() {
        //МЕНЮ

        while (true) {
            printMenu();
            System.out.println("Введите номер меню");
            int menuNum = scanner.nextInt();
            if (menuNum==1){
                System.out.println("Вы выбрали Купить книгу");
                clientService.buyBook();
            }
            else if (menuNum==2) {
                System.out.println("Вы выбрали положить книгу");
                clientService.putBook();
            }
            else if (menuNum==3) {
                System.out.println("Печатаем название книг");
                clientService.putBook();
            }
            else {
                System.out.println("До встречи!");
                break;
            }
        }

    }

    @Override
    public void printMenu() {
        System.out.println("1 - купить книгу, 2- отдать книгу, Всё остальное - выход");

    }
}
