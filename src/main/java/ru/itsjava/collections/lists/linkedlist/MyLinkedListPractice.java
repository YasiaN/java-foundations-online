package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.add("Строка 1");
        System.out.println("list = " + list.toString());
        list.add("Строка 2");
        list.remove(0);
        System.out.println("list = " + list);


    }
}
