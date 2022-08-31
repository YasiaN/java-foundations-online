package ru.itsjava.threads.lecture2;

public class ThreadPractice {
    public static void main(String[] args) {
//        Runnable anonymousRunnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Привет из анонимного класса");
//            }
//        };
//        anonymousRunnable.run();
//        Thread thread = new Thread(anonymousRunnable);
//        thread.start();
//
//        Runnable funclionalRunnable = () -> System.out.println("Привет из функционального программирования");
//        new Thread(funclionalRunnable).start();

//        new Thread (()->
//        {
//            for (int i = 0; i < 5; i++) {
//                Thread.sleep(3000);
//                System.out.println("Привет из быстрого потока");
//
//            }
//        }) .start();
//
//        Runnable runnable = () -> {
//            for (int i = 0; i < 5; i++) {
//                System.out.println("Привет после сна в 3 секунды");
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//
//            }
//        };
//        Thread thread1 = new Thread (runnable);
//        thread1.setDaemon(true);
//        thread1.start();
//
//        System.out.println("End main thread");

//    1. Создать поток реализовав интерфейс Runnable (с помощью лямбда выражения) И вывести "Привет я Runnable"

//        Runnable runnable = () -> {
//            System.out.println("Привет я Runnable");
//
//        };
//        Thread thread = new Thread(runnable);
//        thread.run();
//

//        2. Создать поток реализовав интерфейс Runnable (с помощью лямбда выражения)
//        Который печатает раз в 4 секунды "Привет я проснулся после 4 секунд" И сделать его демоном.

        Runnable runnable=()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Привет я проснулся после 4 секунд");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.run();

    }

}
