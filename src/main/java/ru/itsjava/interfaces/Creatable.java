package ru.itsjava.interfaces;

public interface Creatable {
    void createWish ();
    default void canYouCreateWish() {
        System.out.println("Я могу выполнить твоё желание!");

    }
    default void howManyWishesDoUhave (){
        System.out.println("У тебя есть 3 желания");
    }
}
