package ru.itsjava.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor // конструктор от final полей
public class Coffee {
    private final String title;
    private final String typeOfBean;


}
