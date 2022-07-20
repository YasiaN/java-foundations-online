package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Coffee;
import ru.itsjava.domain.Client;

import java.util.Scanner;

@RequiredArgsConstructor
public class ClientServiceImpl implements  ClientService{
    private final Client client;
    private final Scanner scanner;
    private final CoffeeService coffeeService;

    @Override
    public void buyCoffee() {
        System.out.println("Введите название кофе, которое хотите купить");
        String title = scanner.next();
        if (coffeeService.hasCoffee(title)) {
            System.out.println("Покупаем кофе...");
            Coffee coffee = coffeeService.takeCoffeeByName(title);
            System.out.println("Вы купили кофе "+ coffee + ". Спасибо!");
            client.getCoffees().add(coffee);
        }
        else {
            System.out.println("Не смогли купить кофе.... Такого кофе нет. ");
        }

    }

    @Override
    public void putCoffee() {
        System.out.println("Хотите ли Вы передать пакет кофе для благотворительности?");
        System.out.println("Введите название Вашего нового кофе");
        String title = scanner.next();

        System.out.println("Введите тип зёрен");
        String typeOfBean = scanner.next();

        Coffee coffee = new Coffee (title, typeOfBean);
        coffeeService.putCoffee(coffee);
        System.out.println("Спасибо большое за Ваш вклад!");

    }

    @Override
    public void printCoffee () {
        System.out.println("Уважаемый "+ client.getName());
        System.out.println("Все кофе которые вы заказали : "+ client.getCoffees());

    }
}
