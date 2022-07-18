package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPractice2 {
    public static void main(String[] args) {
        Watch vitaliySeico = new Watch("Seico", "Vitaliy", 18_000.0);
        Watch victorSeico = new Watch("Seico", "Victor", 18_000.0);
        Watch dmitriySeico = new Watch("Seico", "Dmitriy", 30_000.0);
        Watch valentinOmega = new Watch("Omega", "Valentin", 100_000.0);

        List<Watch> watches = new ArrayList<>(Arrays.asList(vitaliySeico, victorSeico, dmitriySeico, valentinOmega));
        System.out.println("Наши часы: " + watches);

//        //вывести все часы, у которых фирма Seico
//        System.out.println("Вывести все часы, у которых фирма Seico");
//        for (Watch elemWatch: watches) {
//            if (elemWatch.getFirm().equals("Seico")) {
//                System.out.print(elemWatch+ " ");
//            }
//        }
//        System.out.println();

//        Вывести все часы, у которых цена больше 30 000 руб
//        System.out.println("Вывести все часы, у которых цена больше 25 000 руб");
//
//        for (Watch elemWatch1: watches ) {
//            if (elemWatch1.getPrice()>25_000.0) {
//                System.out.print(elemWatch1+ " ");
//            }
//        }
//        System.out.println();
//        Вывести одни часы, у которых цена больше 30 000 руб
//        System.out.println("Вывести одни часы, у которых цена больше 30 000 руб");
//        for (Watch elemMoreThan30_000: watches) {
//            if (elemMoreThan30_000.getPrice()>30_000) {
//                System.out.println(elemMoreThan30_000 + " ");
//                break;
//            }
//        }
//        System.out.println();

//        Пропустить первые 2 элемента фирмы Seico
        System.out.println("Пропустить первые 2 элемента");
        int seicoCount = 0;
        for (int i = 0; i < watches.size(); i++) {
            if (watches.get(i).getFirm().equals("Seico") && seicoCount < 2) {
                seicoCount++;
            } else {
                System.out.println(watches.get(i)); // выводим элемент
            }
            System.out.println();
        }
    }
}

