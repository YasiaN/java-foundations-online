package ru.itsjava.interfaces;

public class Dog implements Runnable {

    @Override
    public void run() {
        System.out.println("Беги, собачка!");
    }

    @Override
    public int maxRunDistance() {
        int runDistanceDog = 1000;
        System.out.println("Максимальная дистанция для бега собаки равна " + 1000);
        return runDistanceDog;
    }
}
