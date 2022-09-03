package ru.itsjava.enums;

public enum Coffee {
    ESPRESSO("крепкий"), AMERICANO("с водой"),
    CAPPUCCINO("с молоком"), LATTE("молочный");


    private final String characteristics;

    Coffee(String characteristics) {
        this.characteristics = characteristics;
    }

    public String getCharacteristics() {
        return characteristics;
    }


    @Override
    public String toString() {
        return "Coffee{ " + this.name()+
                " (characteristics='" + characteristics + '\'' +
                '}'+ ")";
    }
}
