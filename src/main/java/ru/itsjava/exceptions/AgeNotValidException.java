package ru.itsjava.exceptions;


// 2. Создать свою ошибку AgeNotValidException

public class AgeNotValidException extends RuntimeException {
    public AgeNotValidException () {
        System.out.println("Exception. Возраст некорректный");;
    }
}
