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
                System.out.println("Вы выбрали Купить кофе");
                clientService.buyCoffee();
            }
            else if (menuNum==2) {
                System.out.println("Вы выбрали добавить новый вид кофе");
                clientService.putCoffee();
            }
            else if (menuNum==3) {
                System.out.println("Печатаем название кофе");
                clientService.printCoffee();
            }
            else {
                System.out.println("До встречи!");
                break;
            }
        }

    }

    private void printMenu() {
        System.out.println("1 - купить кофе, 2- отдать кофе, 3- печатаем название кофе, Всё остальное - выход");

    }
}
