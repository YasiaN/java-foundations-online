package ru.itsjava.interfaces;

public class Cat implements  Runnable {

    @Override
    public void run() {
        System.out.println("Беги, кошечка!");
    }

    @Override
    public int maxRunDistance () {
        int runDistanceCat = 500;
        System.out.println("Максимальная дистанция для бега кошки равна " + 500);
        return runDistanceCat;
    }
}
