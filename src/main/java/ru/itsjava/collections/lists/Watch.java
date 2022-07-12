package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Watch {
    private final String firm;
    private String author;
    private double price;



}
