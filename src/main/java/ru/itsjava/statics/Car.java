package ru.itsjava.statics;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Car {
    private final String model;
    private final String color;
    public static double PRICE=1_000_000.0;


}
