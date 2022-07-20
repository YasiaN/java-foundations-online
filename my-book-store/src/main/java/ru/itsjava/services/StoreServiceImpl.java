package ru.itsjava.services;


import ru.itsjava.domain.Coffee;
import ru.itsjava.domain.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreServiceImpl implements StoreService {
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in); //нет смысла создавать поле

        System.out.println("Введите ваше Имя");
        String clientName = scanner.next();

        Client client = new Client(clientName, new ArrayList<>());

        List <Coffee> coffeeList =new ArrayList<>();
        coffeeList.add(new Coffee("Cappuchino", "arabica"));
        coffeeList.add(new Coffee("Latte", "brazilia"));


        CoffeeService coffeesService = new CoffeeServiceImpl(coffeeList);

        ClientService clientService =
                new ClientServiceImpl(client,scanner,coffeesService);

        MenuService menuService = new MenuServiceImpl(clientService,scanner) ;
        menuService.menu();


        }

    }

