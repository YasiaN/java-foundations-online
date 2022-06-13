//1. В любом классе переопределить методы hashCode и equals
//
//2. Прокомментировать каждую строчку
// (написать в комментариях к каждой строчке кода, что она делает внутри методов equals и hashCode)

package ru.itsjava.object;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString


public class HomeElf {
    private final String name;
    private final int age;

    public HomeElf (String name,int age) {
        this.name=name;
        this.age=age;
    }

//    @Override
//    public boolean equals(Object o) {  // определяем метод equals
//        if (this == o) return true;   // если ссылки на обьекты равны, то равны и обьекты
//        if (o == null || getClass() != o.getClass()) return false; // если обьект пустой или класс обьекта не совпадает с классом обьекта о , то обьекты не равны
//
//        HomeElf homeElf = (HomeElf) o; // клянёмся , что о принадлежит классу homeElf
//
//        if (age != homeElf.age) return false; // если возрасты не равны, то обьекты не равны
//        return name.equals(homeElf.name);
//    }
//
//    @Override
//    public int hashCode() { //определяем метод хэшкод
//        return name.hashCode(); // метожд хэшкод возвращает name
//    }

    // 1. Написать метод toString() к любому классу

//    public String ToString () {
//        return "{ " + "name: " + name + ", age: " + age + " }" ;
//    }



}
