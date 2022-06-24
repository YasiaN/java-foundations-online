package ru.itsjava.interfaces;

public class InterfacesPractice {
    public static void main(String[] args) {
//        Creatable khotabich = new Gin();
//        khotabich.createWish();
//
//        Creatable badGin = new BadGin();
//        badGin.createWish();

//        Walkable jack = new Man ();
//        jack.walk();
//
//        Flyable dragon = new Bird ();
//        dragon.fly();
//        dragon.flyMaxDistance();
//
//        Swimable salmon = new Fish();
//        salmon.swim();
//        salmon.maxSwimSpeed();

        Runnable vaska = new Dog ();
        vaska.maxRunDistance();
        vaska.run();

        Runnable fluffy = new Cat();
        fluffy.maxRunDistance();
        fluffy.run();

    }
}
