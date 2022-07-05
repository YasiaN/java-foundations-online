package ru.itsjava.oop.inheritance;

public class Child implements Father, Mother {

    @Override
    public void giveLove() {
        System.out.println("Child loves you");
    }
}
