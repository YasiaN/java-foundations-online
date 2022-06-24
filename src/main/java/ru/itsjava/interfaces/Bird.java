package ru.itsjava.interfaces;

import java.util.Scanner;

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Лети!");
    }

    @Override
    public String flyMaxDistance() {
        String anyDistanceTofly = "Максимумальное расстояние пока не пролетел. Вперед!";
        System.out.println(anyDistanceTofly);
        return anyDistanceTofly ;

    }
}
