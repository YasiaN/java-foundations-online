package ru.itsjava;


import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data

public class Watch {
private final String firm;
private String author;
private double price;

}
