package ru.itsjava.threads.lecture1;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

//        хотим напечатать 10 раз А с задержкой в 2 секунды
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 2_000_000_000L; j++) {
//
//            }
//            System.out.println("A");
//
//        }

//        более разумный способ:
//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(2000L);
//            System.out.println("A");
//
//        }

//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(2000L);
//            System.out.println("A");
//
//        }
//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(3000L);
//            System.out.println("B");
//
//        }

//  Хотим, чтобы одновременно выполнялись 2 действия:
//        1  2 3 4 5 6 7 8 9 10 11 12 13 14 15
//           A   A   A   A    A    A      A
//             B     B     B    B     B     B


//        PrinterThread printerThreadA = new PrinterThread("A",2000L);
//        PrinterThread printerThreadB = new PrinterThread("B",3000L);
//
//        PrinterRunnable printerRunnable = new PrinterRunnable("B", 3000L);
//
//        Thread threadB=new Thread(printerRunnable);
//
//        System.out.println("start");
//        printerThreadA.start();
//        threadB.start();
//
//        System.out.println("end");

// 1. Создать 2 потока разными способами (Унаследоваться от Runnable и от класса Thread) и запустить их

//        PrinterThread2 printerThreadC = new PrinterThread2("C", 1000L);
//        PrinterThread2 printerThreadD = new PrinterThread2("D", 2000L);
//
//        PrinterRunnable2 printerRunnable2 = new PrinterRunnable2("D", 3000L);
//
//        Thread threadB = new Thread(printerRunnable2);
//
//        System.out.println("start");
//        threadB.start();
//
//
//        System.out.println("end");



//        Написать программу, которая выводит любое сообщение раз в 5 секунд
        for (int i = 0; i < 5; i++) {
            Thread.sleep(5000L);
            System.out.println("Всё получится, ты молодец!");

        }
    }
}


