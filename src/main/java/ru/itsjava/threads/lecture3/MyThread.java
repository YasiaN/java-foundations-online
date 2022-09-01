package ru.itsjava.threads.lecture3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MyThread extends Thread {
    private final int num;
    private final ThreadPractice2 threadPractice2;

    @Override
    public void run() {
        threadPractice2.printNum (num);

    }
}
