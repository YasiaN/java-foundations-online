package ru.itsjava.threads.lecture1;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class PrinterThread2 extends Thread {
    private final String message;
    private long delay;

   @SneakyThrows
   @Override
   public void run(){
       for (int i = 0; i < 5; i++) {
           Thread.sleep(delay);
           System.out.print(message+ " ");

       }
   }

}
