package ru.itsjava.services;


import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Coffee;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeServiceImplTest {

    @Test
    void takeCoffeeByName() {
        List<Coffee> coffeeList = new ArrayList<>();
        Coffee cappuchino = new Coffee("Cappuchino", "arabica");
        coffeeList.add(cappuchino);
        coffeeList.add(new Coffee("Latte", "brazilia"));
//      создать объект класса
        CoffeeServiceImpl coffeeServiceImpl = new CoffeeServiceImpl(coffeeList);
//        тест1 - хотим получить кофе и правильное кофе получим
        Assertions.assertEquals(cappuchino, coffeeServiceImpl.takeCoffeeByName("Cappuchino"));

//      тест 1* проверяем что удалили cappuchino после покупки
        Assertions.assertFalse(coffeeList.contains(cappuchino));

//       тест2 -что мы НЕ получим кофе
        Assertions.assertNull(coffeeServiceImpl.takeCoffeeByName("mokachino"));

    }

    @Test
    void putCoffee() {
        List<Coffee> coffeeList = new ArrayList<>();
        Coffee cappuchino = new Coffee("Cappuchino", "arabica");

        //      создать объект класса
        CoffeeServiceImpl coffeeServiceImpl = new CoffeeServiceImpl(coffeeList);
        coffeeServiceImpl.putCoffee(cappuchino);

        Assertions.assertTrue (coffeeList.contains(cappuchino));
    }

    @Test
    void hasCoffee() {
        List<Coffee> coffeeList = new ArrayList<>();
        Coffee cappuchino = new Coffee("Cappuchino", "arabica");
        //      создать объект класса
        CoffeeServiceImpl coffeeServiceImpl = new CoffeeServiceImpl(coffeeList);

        coffeeList.add (cappuchino);
//тест 1 если объекта нет
        Assertions.assertFalse(coffeeServiceImpl.hasCoffee("Mokachino"));


// тест 2  если объект содержится
        Assertions.assertTrue(coffeeServiceImpl.hasCoffee("Cappuchino"));




    }


}