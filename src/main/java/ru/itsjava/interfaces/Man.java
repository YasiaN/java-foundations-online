package ru.itsjava.interfaces;

// 2. Создать классы: Man (человек), Dog, Cat, Bird, Fish и реализовать соответствующие интерфейсы

public class Man implements Walkable {
    @Override
    public void walk(){
        System.out.println("Гуляй, Вася =)");

    }

}
