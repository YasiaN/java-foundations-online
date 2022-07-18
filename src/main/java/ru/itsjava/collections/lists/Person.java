package ru.itsjava.collections.lists;

// 10. Создать класс Person.( Поля: имя, возраст и пол isMale )
//Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на 'Н'

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Person {

    private final String name;
    private int age;
    private final boolean isMale;





}
