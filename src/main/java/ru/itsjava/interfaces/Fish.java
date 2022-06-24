package ru.itsjava.interfaces;

import java.util.Scanner;

public class Fish implements Swimable {

    @Override
    public void swim() {
        System.out.println("Плыви!");

    }

    @Override
    public double maxSwimSpeed() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите скорость в км/ч: ");
        double swimSpeed = scan.nextDouble();

        if (swimSpeed < 100) {
            System.out.println("Максимальная скорость не достигнута, но попытаться стоит!");
        } else System.out.println(" Вы превысили максимальную зафиксированную скорость. Молодец!");
        return swimSpeed;
    }
}
