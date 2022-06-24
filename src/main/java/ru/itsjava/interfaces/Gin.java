package ru.itsjava.interfaces;

public class Gin implements Creatable {

    @Override  //эта анатац проверяет реально ди мы переопределили метод, который определён ранее
    public void createWish() {
        System.out.println("Слушаю и повинуюсь");

    }
}
