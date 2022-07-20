package ru.itsjava.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class Client {
    private final String name;
    private final List<Coffee> coffees; // список с видами кофе

}
