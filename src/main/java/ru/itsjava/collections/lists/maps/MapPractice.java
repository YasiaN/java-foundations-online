package ru.itsjava.collections.lists.maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
//        Map<Man,String> men = new HashMap<>();
//        Man ivanov = new Man ("Иванов");
//        Man sidorov = new Man ("Сидоров");
//        Man javov = new Man ("Джавов");
//
//        men.put(ivanov, "футболка");
//        men.put(sidorov, "свитшот");
//        men.put(javov, "свитер");
//
//
//        for (Map.Entry<Man, String> pair: men.entrySet()) {
//            System.out.println(pair.getKey()+":"+pair.getValue());
//        }
//
//        System.out.println("________________");
//        for (Man keyMan : men.keySet()) {
//            System.out.println(keyMan+ ":" + men.get(keyMan));
//
//        }
//        System.out.println("men.remove(ivanov) = " + men.remove(ivanov));
//
//        System.out.println("After deleting Ivanov: ");
//        for (Man keyMan : men.keySet()) {
//            System.out.println(keyMan+ ":" + men.get(keyMan));
//
//        }
//        System.out.println("men.size() = " + men.size());
//        System.out.println("men.isEmpty() = " + men.isEmpty());
//
//        System.out.println("men.replace(javov,\"свитер\",\"перчатки\") = " + men.replace(javov, "свитер", "перчатки"));
//        System.out.println("men.get(javov) = " + men.get(javov));
//        men.clear();
//        System.out.println("men.size() = " + men.size());

//        Создать класс Fruit с полями: наименование и вес
//0. Создать экземпляр HashMap (Ключ Имя покупателя, Значение Фрукт)
        Map<String, Fruit> soldFruits = new HashMap<>();

// 1.Вставка элементов:
//а). Добавить 5 фруктов

        Fruit apple = new Fruit("apple", 2.5);
        Fruit peach = new Fruit("peach", 3.5);
        Fruit ananas = new Fruit("ananas", 5.1);
        Fruit banana = new Fruit("banana", 2.5);
        Fruit pear = new Fruit("pear", 0.3);

        soldFruits.put("Ivanov", apple);
        soldFruits.put("Sidorov", peach);
        soldFruits.put("Petrov", ananas);
        soldFruits.put("Javov", banana);
        soldFruits.put("Rozin", pear);
//б). В новый экземпляр HashMap добавим старую карту

        Map<String, Fruit> fruit2 = new HashMap<>();
        Fruit nectarines = new Fruit("nectarines", 0.4);
        fruit2.put("Lebedeva", nectarines);
        System.out.println("fruit2 = " + fruit2);

        fruit2.putAll(soldFruits);
        System.out.println("fruit2 = " + fruit2);

// 2. Получение элемента по ключу (Получить любой фрукт по покупателю)

        System.out.println("fruit2.get(\"Rozin\") = " + fruit2.get("Rozin"));

//        3. Удаление элемента
//а). Удалить любой фрукт

        System.out.println("fruit2.remove(\"Rozin\") = " + fruit2.remove("Rozin"));
        System.out.println("fruit2 = " + fruit2);

//        4. Проверка на наличие ключ и значение (Есть ли покупатель с таким фруктом)

        Fruit coconut = new Fruit("coconut", 3.0);
        for (Map.Entry<String, Fruit> pair : fruit2.entrySet()) {
            if ((pair.getKey() == "coconut") && ((pair.getValue()).equals(3.0))) {
                System.out.println("Покупатель с фрутом " + coconut.getName() + "есть!");
                break;
            } else System.out.println("Покупатель с фруктом " + coconut.getName() + " отсутствует");
            break;
        }

// 5. Вывод Map на экран:
//a) Вывести все ключи (всех покупателей)

//        for (String keyFruit : fruit2.keySet()) {
//           System.out.println(keyFruit+ ":" + fruit2.get(keyFruit));
//

//        б) Вывести все значения (все фрукты)
        System.out.println("fruit2 = " + fruit2.values());

// в) Вывести все ключи и значения с помощью entrySet (всех покупателей и фрукты)
        for (Map.Entry <String, Fruit> pair: fruit2.entrySet()) {
            System.out.println(pair.getKey()+" " +pair.getValue());
        }

    }
}

