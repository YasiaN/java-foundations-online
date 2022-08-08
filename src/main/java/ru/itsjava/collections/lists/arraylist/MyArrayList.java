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

        }
        return false;
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
        int delIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(o)) {
                delIndex = i;
                break;
            }
        }
        if (array.length - 1 - delIndex >= 0) {
            System.arraycopy(array, delIndex + 1, array, delIndex, array.length - 1 - delIndex);
        }
        //смотрим, удалили ли мы элемент?
        if (delIndex == -1) {
            return false;
        } else {
            realSize--;
            return true;
        }
    }

    public void clear() {
        if (realSize != 0) {
            realSize = 0;
            System.out.println("нет объектов в list");
        }
    }

    public Object get(int index) {
// Возвращает элемент, который расположен в указанной позиции списка.

        checkIndex(index);
        return array[index];

    }

    public Object set(int index, Object element) {
//        Замена элемента в указанной позиции index
//        на переданный element. Индекс также должен быть больше нуля и меньше индекса последнего элемента,
//        иначе будет выброшено исключение IndexOutOfBoundsException.
        checkIndex(index);
        array[index] = element;

        return element;
    }

    public void add(int index, Object element) {

//        Добавляет элемент element в позицию index.
//        При добавлении происходит сдвиг всех элементов справа от указанного индекса на 1 позицию вправо:

        checkIndex(index);
        int Count = 0;
        Count++;
        if ((realSize = array.length) == (array = this.array).length) {

            System.arraycopy(array, index, array, index + 1, realSize - index);
            array[index] = element;
            realSize++;
        }
    }

    public Object remove(int index) {
        checkIndex(index);

        Object resElement = array[index];
        if (array.length - 1 - index >= 0) System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        realSize--;
        return resElement;
    }


    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index < realSize)) {
            return true;
        }
        return false;
    }




//        public int indexOf(Object o) {
//        //        Метод возвращает индекс первого вхождения элемента в списке.
////        Если элемента не существует в списке, метод вернет -1.
//
public int indexOf(Object o) {
    return indexOfRange(o, 0, realSize);
}

    int indexOfRange(Object o, int start, int end) {
        Object[] es = array;
        if (o == null) {
            for (int i = start; i < end; i++) {
                if (es[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = start; i < end; i++) {
                if (o.equals(es[i])) {
                    return i;
                }
            }
        }
        return -1;
    }



    public int lastIndexOf(Object o) {
//        Функционал метода похож на indexOf(), отличие в том, что
//        возвращается индекс последнего элемента в списке.
//
//Если элемент не найден, также возвращает -1.

        return lastIndexOfRange(o, 0, realSize);
    }

    int lastIndexOfRange(Object o, int start, int end) {
        Object[] es = array;
        if (o == null) {
            for (int i = end - 1; i >= start; i--) {
                if (es[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = end - 1; i >= start; i--) {
                if (o.equals(es[i])) {
                    return i;
                }
            }
        }
        return -1;
    }


    public String toString() {

        StringBuilder stringBuilder = new StringBuilder("MyArrayList{");

        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]);
            stringBuilder.append(' ');

        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
