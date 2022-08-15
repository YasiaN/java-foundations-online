package ru.itsjava.collections.lists.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {

//        Man andrey = new Man("Andrey");
//        Man maxim = new Man("Maxim");
//        Man vitya = new Man("Vitya");
//
//        Set<Man> manSet = new HashSet<>(Arrays.asList(andrey,maxim,vitya));
//        System.out.println("manSet = " + manSet);
//        System.out.println("manSet.add(andrey) = " + manSet.add(andrey));
//        System.out.println("manSet = " + manSet);
//
//        Man andrey2 = new Man("Andrey");
//        System.out.println("manSet.add(andrey2) = " + manSet.add(andrey2));
//        System.out.println("manSet.contains(andrey) = " + manSet.contains(andrey));
//        System.out.println("manSet.isEmpty() = " + manSet.isEmpty());
//        System.out.println("manSet.remove(andrey2) = " + manSet.remove(andrey2));
//        System.out.println("manSet = " + manSet);
//        System.out.println("manSet.remove(andrey) = " + manSet.remove(andrey));
//        System.out.println("manSet = " + manSet);


        Set <Fruit> setFruit = new HashSet<>();
        Fruit apple = new Fruit("apple", 6.2);
        System.out.println("setFruit.add(apple) = " + setFruit.add(apple));
        System.out.println(setFruit);

        System.out.println("setFruit.add(apple) = " + setFruit.add(apple));
        System.out.println("setFruit = " + setFruit);

        System.out.println(setFruit.remove(apple));
        System.out.println("setFruit = " + setFruit);


    }
}
