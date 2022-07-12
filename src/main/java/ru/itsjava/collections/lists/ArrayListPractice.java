package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
////        List<Watch> watchesList = new ArrayList<>();
////        Watch seico = new Watch("Seico", "Vitaliy", 180_000.0);
////        Watch gShock = new Watch("GSHOCK", "Best dancer", 10_000.0);
////        watchesList.add(seico);
////        watchesList.add(gShock);
////
////        for (Watch elemWatch : watchesList) {
////            System.out.println(elemWatch);
////        }
//
//////        watchesList.remove(0);
////        watchesList.remove(seico);
//
////        System.out.print("List after removal: ");
////        for (Watch elemWatch : watchesList) {
////            System.out.println(elemWatch + " ");
////        }
////        System.out.println();
//////        System.out.println("watchesList.contains(gShock) = " + watchesList.contains(gShock));
//////        System.out.println("watchesList.contains(seico) = " + watchesList.contains(seico));
//////        System.out.println("watchesList.get(0).getFirm() = " + watchesList.get(0).getFirm());
//////        watchesList.set(0,seico);
////        System.out.println(watchesList);
////        System.out.println("watchesList.size() = " + watchesList.size());
////
////        List <Watch> watchOmegaList = new ArrayList<>(); //список с часами только Омега
////        Watch andrewOmega = new Watch ("Omega","Andrew",100_000.00);
////        Watch romanOmega = new Watch ("Omega","Roman",100_000.00);
////        watchOmegaList.add(andrewOmega);
////        watchOmegaList.add(romanOmega);
////        System.out.println("watchOmegaList = " + watchOmegaList);
////
////        watchesList.addAll(watchOmegaList);
////        System.out.println(watchesList);
////
////        Watch vitaliyWatch = new Watch ("Seico","Vitaliy",20_000.0);
////        watchesList.add(1, vitaliyWatch);
////        System.out.println();
////        System.out.println("watchesList = " + watchesList);
//
////        Списки:
////0. Создание списков: (Используя конструктор)
////а). Создать пустой список книг
//
////        List<Book> emptyListofBooks = new ArrayList();
////        System.out.println("emptyListofBooks = " + emptyListofBooks);
//// б). Создать список размером 20
//        List<Book> listOf20Books = new ArrayList<>(20);
//        System.out.println("listOf20Books = " + listOf20Books);
//// 1. Задачи на вставку элемента:
////а) Добавить подряд 5 элементов.
//        Book HarryPotter1 = new Book("HP1", "J.K.Rowling", 500);
//        Book HarryPotter2 = new Book("HP2", "J.K.Rowling", 600);
//        Book HarryPotter3 = new Book("HP3", "J.K.Rowling",700);
//        Book HarryPotter4 = new Book("HP4", "J.K.Rowling",1100);
//        Book HarryPotter5 = new Book("HP5", "J.K.Rowling",900);
//
//        listOf20Books.add(HarryPotter1);
//        listOf20Books.add(HarryPotter2);
//        listOf20Books.add(HarryPotter3);
//        listOf20Books.add(HarryPotter4);
//        listOf20Books.add(HarryPotter5);
//
//        System.out.println("As a result: ");
//        System.out.println("listOf20Books = " + listOf20Books);
//
////// б) Добавить шестой элемент в третию позицию.
////
////        Book HarryPotter6 =new Book("HP6", "J.K.Rowling",950);
////        listOf20Books.add(3,HarryPotter6);
////        System.out.println("listOf20Books = " + listOf20Books);
////
//////        Добавить седьмой элемент в первую позицию.
////        Book HarryPotter7 =new Book("HP7", "J.K.Rowling",980);
////        listOf20Books.add(1,HarryPotter7);
////        System.out.println("listOf20Books = " + listOf20Books);
//
//// в) Записать в новый список все элементы предыдущего списка.
////
////        List <Book> newList= new ArrayList<>();
////        newList.addAll(listOf20Books);
////        System.out.println();
////        System.out.println("newList = " + newList);
//
//// 2. Получить элемент по индексу:
////а). Получить первый элемент (первую книгу в списке)
//        System.out.println("listOf20Books.get(0)= " + listOf20Books.get(0));
////        б). Получить последний элемент (последнюю книгу в списке)
//        // !!!! ЗАКОММЕНТИРОВАТЬ 74-90 строки
//        System.out.println("listOf20Books.get(4) = " + listOf20Books.get(4));
//
////        3. Задачи на удаление элементов: (Используя методы)
////а) Удалить элемент по значению (книге)
//        listOf20Books.remove(HarryPotter1);
//        System.out.println("listOf20Books = " + listOf20Books);
////        б) Удалить элемент по индексу
//        listOf20Books.remove(3);
//        System.out.println("listOf20Books = " + listOf20Books);
////        4. Проверить наличие элемента
//        System.out.println("listOf20Books.contains(HarryPotter1) = " + listOf20Books.contains(HarryPotter1));
//        System.out.println("listOf20Books.contains(HarryPotter3) = " + listOf20Books.contains(HarryPotter3));

//        5. Вывод списка:
//а) Вывести список на экран в формате: List: [ Book{"7 навыков высокоэффективных людей", "Кови", 387};
//Book{"Java. Эффективное программирование", "Блох Дж.", 219};]

        List<Book> list1 = new ArrayList<>(2);
        Book book1 = new Book ("\"7 навыков высокоэффективных людей\"", "\"Кови\"", 387);
        Book book2 = new Book ("\"Java. Эффективное программирование\"", "\"Блох Дж.\"", 219);

        list1.add(book1);
        list1.add(book2);
        System.out.println("list1 = " + list1);

    }
}
