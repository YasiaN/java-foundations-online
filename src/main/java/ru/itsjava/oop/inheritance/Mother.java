package ru.itsjava.oop.inheritance;

public interface Mother  {


    default void giveLove() {
        System.out.println("Mother loves you ");
    }
}
