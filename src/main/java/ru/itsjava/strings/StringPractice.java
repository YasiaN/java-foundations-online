package ru.itsjava.strings;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class StringPractice {
    public static void main(String[] args) {
////        String name = "Yasia";
////        String copyName = "Yasia";
////        System.out.println("(name == copyName) = " + (name == copyName));
////
////        String constructorName= new String("Yasia");
////        System.out.println("(constructorName==name) = " + (constructorName == name));
////
////        //перемещаем строку internConstructorName в пул строк
////        String internConstructorName= constructorName.intern();
////
////        System.out.println("(internConstructorName==name) = " + (internConstructorName == name));
//
//        String str = "Я строка";
//        System.out.println("str.length() = " + str.length());
//
//        System.out.println("str.isEmpty() = " + str.isEmpty());
//        System.out.println("str.equals(\"Я строкA\") = " + str.equals("Я строкA"));
//        System.out.println("str.equalsIgnoreCase(\"Я строкA\") = " + str.equalsIgnoreCase("Я строкА"));
//
//        String[] strs = str.split(" ");
//        System.out.println(strs[0]);
//        System.out.println(strs[1]);
//
//// пример конкатенации
//
////        for (int i = 0; i < 10_000_000; i++) {
////            str = str + "!";
////        }
//
//        StringBuilder builderStr = new StringBuilder(str);
//        for (int i = 0; i < 10_000_000; i++) {
//            builderStr.append ('!');
//        }
//        System.out.println("builderStr.toString() = " + builderStr.toString());
//

// Вызвать разные методы строк и в комментариях к каждому вызванному методу написать, что метод делает.

        String nikeSlogan = "Just do it";
        String adidasSlogan = "Nothing is impossible";
        System.out.println("nikeSlogan.equals(adidasSlogan) = " + nikeSlogan.equals(adidasSlogan)); // сравнивает строки и выводит результат сравнения

        String nikeSlogan2 = "Just do it!";
        System.out.println("nikeSlogan2.equals(nikeSlogan) = " + nikeSlogan2.equals(nikeSlogan)); // сравнивает строки и выводит результат сравнения

        String adidasSlogan2 = "NOTHING IS impossible";
        System.out.println("adidasSlogan2.equalsIgnoreCase(adidasSlogan) = " + adidasSlogan2.equalsIgnoreCase(adidasSlogan)); // сравнивает строки, не учитывая регистры и выводит результат сравнения

        // создаём новую строку со значением = internAdidasSlogan2 и добваляем её в пул строк:
        String internAdidasSlogan2 = adidasSlogan2.intern();
        //преобразуем строку в строку с заглавными буквами
        System.out.println("internAdidasSlogan2.toUpperCase() = " + internAdidasSlogan2.toUpperCase());


        //преобразуем строку в строку с маленькими буквами
        System.out.println("nikeSlogan2.toLowerCase() = " + nikeSlogan2.toLowerCase());


        //getBytes метод возвращает массив, поэтому мы сначала

        String disneySlogan = "Happiest place on Earth."; // создаём объект
        String[] arrayDisneySlogan = disneySlogan.split(" "); //  создаём массив, где обьект делим на слова. Слова- элементы массива.

        System.out.println("arrayDisneySlogan = " + Arrays.toString(arrayDisneySlogan)); //вывели получившейся массив

        System.out.println("Arrays.toString(disneySlogan.getBytes()) = " + Arrays.toString(disneySlogan.getBytes())); //выводим в строку getBytes()

//        методы, принемяемые к объектам (строкам) класса StringBuilder

        StringBuilder firstStringBuilder = new StringBuilder(disneySlogan);

//вывод строки
        System.out.println("firstStringBuilder.toString() = " + firstStringBuilder);

        //добавляем к строке Yeeeey!  и выводим
        System.out.println("firstStringBuilder.append(\"Yeeeey\"+'!') = " + firstStringBuilder.append("yeeeey" + '!'));

        //удаляем ! в строке и выводим
        System.out.println("firstStringBuilder.deleteCharAt(30) = " + firstStringBuilder.deleteCharAt(30));


    }
}
