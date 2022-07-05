package ru.itsjava.oop.inheritance;

public interface Talkable {

    default void talk() {
        System.out.println("Ля-ля-ля");
    }
    String giveTalk ();
}
