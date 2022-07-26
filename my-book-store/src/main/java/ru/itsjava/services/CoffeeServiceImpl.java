package ru.itsjava.services;

import ru.itsjava.domain.Coffee;

import java.util.List;

public class CoffeeServiceImpl implements CoffeeService {
    private final List<Coffee> coffeesFromStore;

    public CoffeeServiceImpl(List<Coffee> coffeesFromStore) {
        this.coffeesFromStore = coffeesFromStore;
    }


    @Override
    public Coffee takeCoffeeByName(String name) {
        Coffee resCoffee = null;

        for (Coffee coffee : coffeesFromStore) {
            if (coffee.getTitle().equals(name)) {
                resCoffee = coffee;
                break;
            }

        }
        if (resCoffee != null) {
            coffeesFromStore.remove(resCoffee);

            return resCoffee;
        }
        return null;
    }


    @Override
    public void putCoffee(Coffee coffee) {
        coffeesFromStore.add(coffee);

    }

    @Override
    public boolean hasCoffee(String name) {
        for (Coffee coffee : coffeesFromStore) {
            if (coffee.getTitle().equals(name)) {
                return true;
            }

        }
        return false;
    }

    @Override
    public void printCoffees() {
        for (Coffee coffee : coffeesFromStore) {
            System.out.println(coffee.getTitle() + " " + coffee.getTypeOfBean());


        }
    }
}
