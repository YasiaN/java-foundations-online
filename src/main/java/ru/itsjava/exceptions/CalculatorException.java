package ru.itsjava.exceptions;

public class CalculatorException extends RuntimeException { //создаём конструктор

    public CalculatorException (String message) {
        super (message);
    }

}
