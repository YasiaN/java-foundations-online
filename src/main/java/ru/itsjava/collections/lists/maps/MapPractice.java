package ru.itsjava.collections.lists.maps;

import java.util.HashMap;
import java.util.HashSet;
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
// проверить содержится ли фрукт в множестве фруктов?
        System.out.println("soldFruits.containsKey(\"apple\") = " + soldFruits.containsKey("apple"));
//
//    }
//}

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

//        Fruit coconut = new Fruit("coconut", 3.0);
//        for (Map.Entry<String, Fruit> pair : fruit2.entrySet()) {
//            if ((pair.getKey().equals("coconut")) && ((pair.getValue()).equals(3.0))) {
//                System.out.println("Покупатель с фрутом " + coconut.getName() + "есть!");
//                break;
//            } else {
//                System.out.println("Покупатель с фруктом " + coconut.getName() + " отсутствует")
//            } ;
//            break;
//        }
//    }
//}

// 5. Вывод Map на экран:
//a) Вывести все ключи (всех покупателей)

//        for (String keyFruit : fruit2.keySet()) {
//            System.out.println(keyFruit + ":" + fruit2.get(keyFruit));
//        }

//        б) Вывести все значения (все фрукты)
//        System.out.println("fruit2 = " + fruit2.values());

// в) Вывести все ключи и значения с помощью entrySet (всех покупателей и фрукты)
//        for (Map.Entry <String, Fruit> pair: fruit2.entrySet()) {
//            System.out.println(pair.getKey()+" " +pair.getValue());
//        }


//        6. Отфильтровать Map вернуть записи по некоторому условию:
//а) Условие на ключ: вернуть количество ключей длина которых больше 5 (покупателей, чье имя больше 5)

//        Map<Man,String> men = new HashMap<>();
//        Man ivanov = new Man ("Иванов");
//        Man sidorov = new Man ("Сидоров");
//        Man jav = new Man ("Джав");
//
//        men.put(ivanov, "футболка");
//        men.put(sidorov, "свитшот");
//        men.put(jav, "свитер");
//
//        for (Man keyMan: men.keySet()) {
//            if (keyMan.getName().length() >5) {
//                System.out.println(keyMan);
//            }
//        }
//        б) Условие на значение: Вернуть количество элементов, которые равны "***" (фруктов, которые равны дыне)
//
//        Map<String, Fruit> soldFruits = new HashMap<>();
//
//        Fruit apple = new Fruit("apple", 2.5);
//        Fruit peach = new Fruit("peach", 3.5);
//        Fruit ananas = new Fruit("ananas", 5.1);
//        Fruit banana = new Fruit("banana", 2.5);
//        Fruit melon = new Fruit("melon", 0.3);
//
//        soldFruits.put("Ivanov", apple);
//        soldFruits.put("Sidorov", peach);
//        soldFruits.put("Petrov", ananas);
//        soldFruits.put("Javov", banana);
//        soldFruits.put("Rozin", melon);
//
//        int count = 0;
//        for (Fruit valueFruit : soldFruits.values()) {
//            if (valueFruit.equals(melon)) {
//                count++;
//            }
//
//        } System.out.println("фруктов, которые равны melon = " + count);

//        7. Пропустить несколько элементов
//а) Пропустить 2 элемента, значения которых Арбуз, все остальные вывести.
//        Map<String, Fruit> soldFruits = new HashMap<>();
//
//        Fruit apple = new Fruit("apple", 2.5);
//        Fruit peach = new Fruit("peach", 3.5);
//        Fruit ananas = new Fruit("ananas", 5.1);
//        Fruit watermelon = new Fruit("watermelon", 2.5);
//
//
//        soldFruits.put("Ivanov", apple);
//        soldFruits.put("Sidorov", peach);
//        soldFruits.put("Petrov", ananas);
//        soldFruits.put("Javov", watermelon);
//        soldFruits.put("Rozin", watermelon);
//
//        for (Map.Entry<String,Fruit>pair: soldFruits.entrySet()) {
//            if (!(pair.getValue().equals(watermelon))) {
//                System.out.println(pair.getKey()+pair.getValue());
//            }
//        }

// б) Вывести все кроме 2 элементов, ключи которых начинаются на А

//        Map<String, Fruit> soldFruits = new HashMap<>();
//
//        Fruit apple = new Fruit("apple", 2.5);
//        Fruit peach = new Fruit("peach", 3.5);
//        Fruit ananas = new Fruit("ananas", 5.1);
//        Fruit watermelon = new Fruit("watermelon", 2.5);
//
//
//        soldFruits.put("Ivanov", apple);
//        soldFruits.put("Asidorov", peach);
//        soldFruits.put("Petrov", ananas);
//        soldFruits.put("Javov", watermelon);
//        soldFruits.put("Atozin", watermelon);
//
//        for (Map.Entry <String,Fruit> pair: soldFruits.entrySet()) {
//            if (pair.getKey().startsWith("A")) {
//                System.out.println(pair);
//            }
//        }
// 8. Вернуть первый подходящий элемент:
//а) Возвращаем элемент значение которого арбуз или Арбуз или АРбУз.

//        Map<String,Fruit> fruits3= new HashMap<>();
//
//        Fruit apple = new Fruit("apple",2.2);
//        Fruit watermelon1 = new Fruit("арбуз",2.2);
//        Fruit watermelon2 = new Fruit("Арбуз",2.2);
//        Fruit watermelon3 = new Fruit("АРбУз",2.2);
//
//        fruits3.put ("Ivanov", watermelon1);
//        fruits3.put ("Javov", watermelon2);
//        fruits3.put ("Sidorov", watermelon3);
//        fruits3.put ("Petrov", apple);
//
//        for (Fruit keyFruit: fruits3.values ()) {
//            if (keyFruit.getName().equalsIgnoreCase("арбуз")) {
//                System.out.println("keyFruit = " + keyFruit);

//           9. Возвращаем все элементы удовлетворяющие условию:
//а) Возвращаем все элементы в другую карту, которые являются дыней или арбузом
//        Map<String, Fruit> fruits3 = new HashMap<>();
//        Fruit apple = new Fruit("apple", 2.2);
//        Fruit watermelon1 = new Fruit("арбуз", 2.2);
//        Fruit watermelon2 = new Fruit("Арбуз", 2.2);
//        Fruit watermelon3 = new Fruit("АРбУз", 2.2);
//        Fruit melon = new Fruit("Дыня", 1.2);
//
//        fruits3.put("Ivanov", watermelon1);
//        fruits3.put("Javov", watermelon2);
//        fruits3.put("Sidorov", watermelon3);
//        fruits3.put("Petrov", apple);
//        fruits3.put("Klimov", melon);
//
//        Map<String, Fruit> newFruitMap = new HashMap<>();
//        for (Map.Entry<String, Fruit> pair : fruits3.entrySet()) {
//            if ((pair.getValue().getName().equalsIgnoreCase("арбуз")) ||
//                    (pair.getValue().getName().equalsIgnoreCase("дыня"))) {
//                newFruitMap.put(pair.getKey(), pair.getValue());
//            }
//        }
//        System.out.println("newFruitMap = " + newFruitMap);
//        10. Найти средний вес всех фруктов.
//        Map<String, Fruit> fruits3 = new HashSet<>();
//        Fruit apple = new Fruit("apple", 2.2);
//        Fruit watermelon1 = new Fruit("арбуз", 2.2);
//        Fruit watermelon2 = new Fruit("Арбуз", 2.2);
//        Fruit watermelon3 = new Fruit("АРбУз", 2.2);
//        Fruit melon = new Fruit("Дыня", 1.2);
//
//        fruits3.put("Ivanov", watermelon1);
//        fruits3.put("Javov", watermelon2);
//        fruits3.put("Sidorov", watermelon3);
//        fruits3.put("Petrov", apple);
//        fruits3.put("Klimov", melon);
//
//
//        double countSummWeight=0;
//        for (Fruit valueFruit : fruits3.values()) {
//            valueFruit.getWeight();
//            double countSummWeight1=valueFruit.getWeight();
//            countSummWeight+=countSummWeight1;
//        }
//        System.out.println(countSummWeight);
//
//    }
//
//
//}
//        for (Map.Entry<String, Fruit> pair: fruits3.entrySet()) {
//            double countAverageWeight=0;
//            double weightFruits3=pair.getValue().getWeight();
//            System.out.println("pair.getValue().getWeight() = " + pair.getValue().getWeight());
//            (pair.getValue().getWeight())+countAverageWeight=countAverageWeight;
//        }


