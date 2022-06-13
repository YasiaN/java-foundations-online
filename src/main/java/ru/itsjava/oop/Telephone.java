package ru.itsjava.oop;

public class Telephone {
    private final String brand;
    private boolean isHomey;

    public Telephone(String brand) {
        this.brand = brand;
    }
    public Telephone (String brand, boolean isHomey) {
        this.brand=brand;
        this.isHomey=isHomey;
    }

    public String toString() {
       return "{ brand:"+ brand+ " isHomey:"+isHomey + "}";
    }
}
