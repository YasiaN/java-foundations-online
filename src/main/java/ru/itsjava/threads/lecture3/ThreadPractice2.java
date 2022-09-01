package ru.itsjava.threads.lecture3;

import lombok.SneakyThrows;

public class ThreadPractice2 {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();

//        synchronized (obj) {
//            obj.notify();
//        }


        ThreadPractice2 threadPractice2 = new ThreadPractice2();
        MyThread thread1 = new MyThread(1, threadPractice2);
        MyThread thread2 = new MyThread(2, threadPractice2);
        MyThread thread3 = new MyThread(3, threadPractice2);

        thread1.start();
        thread2.start();
        thread3.start();


    }

    @SneakyThrows
    public synchronized void  printNum(int num) {
//        synchronized (this) {
            System.out.println("Begin" + num);
//            this.wait(300);
        Thread.sleep (3000);
           System.out.println("End" + num);


        }
    }
//}
