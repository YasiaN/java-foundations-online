package ru.itsjava.interfaces;

public class BadGin implements Creatable{
    @Override
    public void createWish () {
        System.out.println("Плохо исполнил желание!");
    }
}
