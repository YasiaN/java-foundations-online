package ru.itsjava.oop;


// 2. +Создать иерархию Птицы, Попугай и Вороны.
// (Подумать чем характеризуются птицы, какие методы должны быть и нужно обязательно явно использовать ссылку super)

public class Bird {
        //поля
    final private String name;
    private double size;
    final private boolean isHomey;

    // конструктор
    public Bird(String name, double size, boolean isHomey) {
        this.name=name;
        this.size=size;
        this.isHomey=isHomey;
    };

    //метод

    public String toString() {
        return "Birds{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", isHomey=" + isHomey +
                '}';
    }

    public double getSize () {
        return size;
    }
    public void setSize (double size) {
        this.size=size;
    }
}
