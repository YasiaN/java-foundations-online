package ru.itsjava.threads.lecture1;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class PrinterRunnable2 implements Runnable {

    private final String message;
    private final long delay;

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            Thread.sleep (delay);
            System.out.println( message+ " ");
        }
    }
}
