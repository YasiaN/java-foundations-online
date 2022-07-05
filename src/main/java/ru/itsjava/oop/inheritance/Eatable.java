package ru.itsjava.oop.inheritance;

public interface Eatable {

    default void eat() {
        System.out.println("Ням-ням-ням");
    }
   public String giveFood ();
}
