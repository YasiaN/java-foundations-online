package ru.itsjava.collections.lists.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @Test
    void size() {
        //создаём тестовые данные
        MyArrayList list_test = new MyArrayList();
        list_test.add("element_1");
        list_test.add("element_2");
        list_test.add("element_3");
        // сравниваем ожидаемый результат и фактический результат
        Assertions.assertEquals(3, list_test.size());
    }

    @Test
    void isEmpty() {
        MyArrayList list_test = new MyArrayList();

        Assertions.assertTrue(list_test.size() == 0);

        list_test.add("element_1");
        list_test.add("element_2");
        list_test.add("element_3");
        Assertions.assertFalse(list_test.size() == 0);
    }

    @Test
    void contains() {
        MyArrayList list_test = new MyArrayList();
        Assertions.assertEquals( false,(list_test.contains("element_1")));
        list_test.add("element_1");
        list_test.add("element_2");
        list_test.add("element_3");

        Assertions.assertEquals( true, (list_test.contains("element_1")));

    }

    @Test
    void add() {
        MyArrayList list_test = new MyArrayList();
        list_test.add("element_1");
        Assertions.assertTrue(list_test.contains("element_1"));
    }

    @Test
    void remove() {
        MyArrayList list_test = new MyArrayList();
        list_test.add("element_1");
        list_test.remove("element_1");

        Assertions.assertFalse(list_test.contains("element_1"));
    }

    @Test
    void clear() {
        MyArrayList list_test = new MyArrayList();
        list_test.add("element_1");
        list_test.clear();
        Assertions.assertEquals(true,list_test.isEmpty()==true);

    }

    @Test
    void get() {
        MyArrayList list_test = new MyArrayList();
        list_test.add("element_1");
        Assertions.assertEquals("element_1",list_test.get(0));

    }

    @Test
    void set() {
        MyArrayList list_test = new MyArrayList();
        list_test.add("element_1");
        list_test.set(0,"element_1_new");
        Assertions.assertEquals("element_1_new",list_test.set(0, "element_1_new"));
    }

    @Test
    void testAdd() {
        MyArrayList list_test = new MyArrayList();
        list_test.add(0,"element_1");
        list_test.add(1,"element_2");
        Assertions.assertTrue(list_test.contains("element_2"));
        Assertions.assertEquals(1,list_test.indexOf("element_2"));

    }

    @Test
    void testRemove() {
        MyArrayList list_test = new MyArrayList();
        list_test.add("element_1");
        list_test.add("element_2");
        list_test.remove(0);
        Assertions.assertTrue(list_test.get(0).equals("element_2"));
    }

    @Test
    void indexOf() {
        MyArrayList list_test = new MyArrayList();
        list_test.add("element_1");
        list_test.add("element_2");
        Assertions.assertEquals(1,list_test.indexOf("element_2"));

    }

    @Test
    void indexOfRange() {
        MyArrayList list_test = new MyArrayList();
        list_test.add("element_1");
        list_test.add("element_2");
        Assertions.assertEquals(1,list_test.indexOfRange("element_2", 0,2));
    }

    @Test
    void lastIndexOf() {
        MyArrayList list_test = new MyArrayList();
        list_test.add("element_1");
        list_test.add("element_2");
        list_test.add("element_2");
        Assertions.assertEquals(2,list_test.lastIndexOf("element_2"));
    }

    @Test
    void lastIndexOfRange() {
        MyArrayList list_test = new MyArrayList();
        list_test.add("element_1");
        list_test.add("element_2");
        list_test.add("element_2");
        Assertions.assertEquals(2,list_test.lastIndexOfRange("element_2", 0,3));
    }

    @Test
    void testToString() {
        MyArrayList list_test = new MyArrayList();
        list_test.add("element_1");
        list_test.add("element_2");
        list_test.add("element_3");
        Assertions.assertEquals("MyArrayList{element_1 element_2 element_3 }",list_test.toString());
    }
}