package ru.itsjava.collections.lists.iterators;

import ru.itsjava.collections.lists.maps.Man;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorPractice {
    public static void main(String[] args) {
        Map<Man,String> men = new HashMap<>();
        Man ivanov = new Man ("Иванов");
        Man sidorov = new Man ("Сидоров");
        Man javov = new Man ("Джавов");

        men.put(ivanov, "футболка");
        men.put(sidorov, "свитшот");
        men.put(javov, "свитер");

        Iterator<Map.Entry<Man, String>> iterator = men.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Man, String> pair = iterator.next();
            System.out.println(pair.getKey()+ ": " + pair.getValue());

        }


    }
}
