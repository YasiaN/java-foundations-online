package ru.itsjava.collections.lists;

import lombok.ToString;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
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
//        Book HarryPotter3 = new Book("HP3", "J.K.Rowling", 700);
//        Book HarryPotter4 = new Book("HP4", "J.K.Rowling", 1100);
//        Book HarryPotter5 = new Book("HP5", "J.K.Rowling", 900);
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

//        List<Book> list1 = new ArrayList<>(2);
//        Book book1 = new Book ("\"7 навыков высокоэффективных людей\"", "\"Кови\"", 387);
//        Book book2 = new Book ("\"Java. Эффективное программирование\"", "\"Блох Дж.\"", 219);
//
//        list1.add(book1);
//        list1.add(book2);
//        System.out.println("list1 = " + list1);

//        6. Отфильтровать список вернуть записи по некоторому условию:
//а) Условие на индекс: Индекс делится на 3

//        System.out.println("Записи с учётом условия на индекс: Индекс делится на 3");
//
//        for (int i = 0; i < listOf20Books.size(); i++) {
//            if (i % 3 == 0) {
//                System.out.println(listOf20Books.get(i));
//            }
//        }

//        б) Условие на значение: Вернуть количество книг, которые равны "Java"
//
//        System.out.println("Вернуть количество книг, которые равны \"Java\"");
//        for (Book elemBook : listOf20Books) {
//            if (elemBook.getName().equals("Java")) {
//                System.out.println(elemBook);
//            }
//        }
//        System.out.println();

//        7. Пропустить несколько первых элементов
//а) Пропустить первые 3 книги в списке.

//        System.out.println("Выводим книги без первых 3х книг в списке.");
//        int count = 0;
//        for (int i = 0; i < listOf20Books.size(); i++) {
//
//            if (count < 3) {
//                count++;
//            } else System.out.println(listOf20Books.get(i));;
//        }

// 6 + 7: Пропускаем элементы, которые удовлетворяют некоторому условию
//а) Пропустить первые 2 книги, которые равные "Java"

//        Book java1= new Book ("Java","James Gosling",900);
//        Book java2= new Book ("Java","James Gosling",1000);
//
//        listOf20Books.add(java1);
//        listOf20Books.add(java2);
//
//        System.out.println("Первоначальный список:"+listOf20Books);
//        System.out.println("Пропустить первые 2 книги, которые равные \"Java\"");
//        int countBooks = 0;
//        for (Book elementBook : listOf20Books) {
//            if ((elementBook.getName() == "Java") & (countBooks < 3)) {
//                countBooks++;
//            } else {
//                System.out.println(elementBook);
//            }
//        }

//        8. Вернуть первый подходящий элемент:
//
//а) Возвращаем первую книгу, длина автора которого делится на 3.
//        Book java1 = new Book("Java ", "JamesGosling", 900);
//        Book java2 = new Book("Java", "JamesGosling", 1000);
//
//        listOf20Books.add(java1);
//        listOf20Books.add(java2);
//        System.out.println("Список книг:");
//        System.out.println(listOf20Books);
//        System.out.println("Возвращаем первую книгу, длина автора которого делится на 3");
//        for (Book elemBook : listOf20Books) {
//            if (((elemBook.getAuthor().length()) % 3) == 0) {
//                System.out.println(elemBook);
//                break;
//            }
//
//        }
// 9. Возвращаем все элементы удовлетворяющие условию:
//а) Возвращаем все книги, длина автора которых делится на 3.

//        Book java1 = new Book("Java ", "JamesGosling", 900);
//        Book java2 = new Book("Java ", "JamesGosling", 1000);
//
//        listOf20Books.add(java1);
//        listOf20Books.add(java2);
//
//        System.out.println("Возвращаем все книги, длина автора которых делится на 3.");
//        for (Book elemBook : listOf20Books) {
//            if ((elemBook.getAuthor().length())%3==0) {
//                System.out.println(elemBook);
//            }
//
//        }

//  10. Создать класс Person.( Поля: имя, возраст и пол isMale )
////Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на 'Н'

//        Person jake = new Person("jake", 22, true);
//        Person henk = new Person("henk", 50, true);
//        Person hugo = new Person("hugo", 17, true);
//        Person harry = new Person("harry", 25, true);
//        Person henry = new Person("henry", 26, true);
//        Person ann = new Person("ann", 19, false);
//        List<Person> listService = new ArrayList<>(Arrays.asList(jake, henk, hugo, harry, henry, ann));
//
//        System.out.println("Список военнообязанных: ");
//        System.out.println(listService);
//
//        System.out.println("Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на 'Н':" );
//        for (Person personService : listService) {
//            if ((personService.isMale()) && (personService.getAge() < 27) && (personService.getAge() > 18) && (personService.getName().charAt(0) == 'h')) {
//                System.out.println(personService);
//            }
//        }
//        System.out.println();

// 11. Найти средний возраст всех женщин.

        Person ann = new Person("ann", 19, false);
        Person kate = new Person("kate", 30, false);
        Person joanna = new Person("joanna", 45, false);
        Person clair = new Person("clair", 7, false);

        List<Person> listWoman = new ArrayList<>(Arrays.asList(ann, kate, joanna, clair));
        System.out.println("Найти средний возраст всех женщин.");


        int countOfWomen = listWoman.size();
        System.out.println("countOfWomen = " + countOfWomen);

        int sumAgeOfAllWomen = 0;

        for (Person elemWoman : listWoman) {
            System.out.println(elemWoman.getAge());
            sumAgeOfAllWomen += elemWoman.getAge(); // sumAgeOfAllWomen = sumAgeOfAllWomen+ elemWoman.getAge();
            System.out.println(" значение sumAgeOfAllWomen:" + sumAgeOfAllWomen);

        }
        double averageAge = (double) sumAgeOfAllWomen/countOfWomen;
        System.out.println("averageAge = " + averageAge);
    }
}





