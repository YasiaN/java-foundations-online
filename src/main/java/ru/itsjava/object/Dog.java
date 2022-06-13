package ru.itsjava.object;

import lombok.*;


import lombok.AllArgsConstructor;

//@AllArgsConstructor
//@Data
//@NoArgsConstructor
//public class Dog {
//    private final String nickname;
//    private int pawsCount;



//    public Dog(String nickname, int pawsCount) {
//        this.nickname = nickname;
//        this.pawsCount = pawsCount;
//
//    }

//    @Override
//    public boolean equals(Object o) { // определяем метод equals
//        if (this == o) return true;  // если ссылки на объекты равны, то возвращаем true (то есть объекты равны) и не сравниваем дальше
//        if (o == null || getClass() != o.getClass()) return false; // если объект пустой или оба объекта не попали в один и тот же класс,
//        //  то выводим false то есть классы не равны
//
//        Dog dog = (Dog) o; // приводим к виду. то есть говорим джаве о том, что объект o точно является объектом  класса Dog
//
//        return nickname.equals(dog.nickname);
//    }
//
//    @Override
//    public int hashCode() {
//        return nickname.hashCode(); //берем hashcode от nickname
//    }

//    @Override
//    public String toString(){
//        return "Dog{nickname: " + nickname + ", paws: "+ pawsCount + "}";
//
//    }
//
//
//  2. Переписать классы с помощью аннотаций библиотеки Lombok (лучше все;))


