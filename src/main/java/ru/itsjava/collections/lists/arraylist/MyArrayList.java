package ru.itsjava.collections.lists.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private int realSize;
    private Object[] array;

    //   конструктор
    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() { // метод который проверяет, равен ли размер списка 0 => true, else=>false

        if (realSize == 0) {
            return true;
        }
        return false;
    }


    public boolean contains(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)) {
                return true;
            }

        } return false;

    }


    public boolean add(Object o) {
        if (realSize == array.length) {

            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            // скопировали массив
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;

        }
        array[realSize++] = o; //вставили наш элемент
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

  public void clear() {
    if (realSize!=0) {
        realSize=0;
        System.out.println("нет объектов в list");
          }
      }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
//        return "MyArrayList{" + Arrays.toString(array) + '}';
        StringBuilder stringBuilder = new StringBuilder("MyArrayList{");

        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]);
            stringBuilder.append(' ');

        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
