package ru.itsjava.statics;

// 1. Класс Фигура из предыдущей домашки сделать абстрактным (отдельно пришлите его в дз)
public abstract class Figure {

    public abstract String turnAt180Degrees ();
    public void turnAt360Degrees () {
        System.out.println("Месторасположение фигуры не поменялось");
    }

}
