package ru.itsjava.iostreams;

import ru.itsjava.collections.lists.arraylist.MyArrayList;

import java.io.*;
import java.util.*;

public class IOStreamsPractice {
    public static void main(String[] args) {
//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//        String input = console.readLine();
//
//        try {
//            String input = console.readLine();
//            System.out.println("Ваш input равен "+ input);
//        }
//        catch (IOException exception) {
//            exception.printStackTrace();
//
//        } finally {
//            try {
//                console.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

//        try with recourses:
//        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
//            String input = console.readLine();
//            System.out.println("Ваш input равен " + input);
//        } catch (IOException exception) {
//            exception.printStackTrace();
//
//        File file = new File("src/main/resources/file.txt");
//        try (PrintWriter printWriter = new PrintWriter(file)) {
//            printWriter.println("Строка1");
//            printWriter.println("Строка2");
//            printWriter.println("Строка3");
//
//
//        } catch (FileNotFoundException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        }
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//            String input;
//            while ((input = reader.readLine()) != null) {
//                System.out.println("reader.readLine() = " + input);
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//}
// ДЗ 1. Даны 2 файла. В каждом файле содержится текст. Необходимо поменять местами содержимое файлов.
//  P.S. Это задание лучше выполнять считав вначале файл в коллекцию и потом записать из нее в файл.

        File file1 = new File("src/main/resources/file1.txt");
        try (PrintWriter printWriter = new PrintWriter(file1)) { //записываем первый файл (создадим при запуске file1)
            printWriter.println("Строка11");
            printWriter.println("Строка12");
            printWriter.println("Строка13");  // 2. добавила в него строки: "Строка 11","Строка 12","Строка 13")
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        FileReader fileReader1 = null;
        try {
            fileReader1 = new FileReader(file1);//читаем записанный первый файл
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(fileReader1); // 3. считать файл в коллекцию
        String line;
        while (true) {
                        try {
                if ((line = reader.readLine()) == null) {break;}
                else {
                    List <String> myList2=new ArrayList<>();
                    myList2.add(line);
                    System.out.println("myList.toString() = " + myList2.toString());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File file2 = new File("src/main/resources/file2.txt"); //записываем второй файл
        try (PrintWriter printWriter2 = new PrintWriter(file2)) {
            printWriter2.println("Строка14");
            printWriter2.println("Строка15");
            printWriter2.println("Строка16");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        FileReader fileReader2 = null;
        try {
            fileReader2 = new FileReader(file2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader reader2 = new BufferedReader(fileReader2);
        String line2;
        while (true) {
            try {
                if ((line2 = reader2.readLine()) == null) {break;}
                else {
                    List <String> myList2=new ArrayList<>();
                    myList2.add(line2);
                    System.out.println("myList.toString() = " + myList2.toString());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

