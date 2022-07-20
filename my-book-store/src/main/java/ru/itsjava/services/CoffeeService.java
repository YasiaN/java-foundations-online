package ru.itsjava.services;


import ru.itsjava.domain.Coffee;

public interface CoffeeService {
        Coffee takeCoffeeByName (String name); // взять кофе
        void putCoffee(Coffee coffee);  // положить кофе
        boolean hasCoffee (String name); // проверить наличие кофе
    void printCoffees();
    }
