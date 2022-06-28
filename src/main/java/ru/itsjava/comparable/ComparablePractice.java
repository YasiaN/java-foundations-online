package ru.itsjava.comparable;

import ru.itsjava.clonable.Girl;

import java.util.Arrays;

public class ComparablePractice {
    public static void main(String[] args) throws CloneNotSupportedException {

//        Boy vitalik = new Boy("vitalik",15, 165);
//        Boy vasya = new Boy("vasya",14, 160);
//        Boy vanya = new Boy("vanya",18, 180);
//
//        System.out.println("vitalik.compareTo(vasya) = " + vitalik.compareTo(vasya));
//        System.out.println("vasya.compareTo(vanya) = " + vasya.compareTo(vanya));
//
//        Boy [] boys = {vitalik,vasya,vanya};
//        System.out.println(Arrays.toString(boys));
//        Arrays.sort (boys);
//
//        System.out.println(Arrays.toString(boys));

//
//        Person human1 = new Person("katia", "ivanova", 22);
//        Person human2 = new Person("katia", "petrova", 50);
//        human1.compareTo(human2);
//
//        Person human3 = new Person("dima", "ivanov", 99);
//        human3.compareTo(human2);


//        В классе Main добавить в массив несколько человек. Отсортировать и вывести на экран.

//        Person[] humans = {human2, human3, human1};
//        System.out.println("humans = " + Arrays.toString(humans));
//        Arrays.sort(humans);
//        System.out.println("humans = " + Arrays.toString(humans));


// 5. В классе Main создать клона некоторого Person.
        Person suleyman = new Person ("suleyman", "sultan", 39 );
        Person mehmed = (Person) suleyman.clone();
        System.out.println("mehmed = " + mehmed);
        System.out.println("suleyman = " + suleyman);

    }
}
