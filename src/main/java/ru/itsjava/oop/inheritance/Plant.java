package ru.itsjava.oop.inheritance;

public class Plant implements Eatable{


    @Override
    public String giveFood () {
       String lineToPrint="Полей меня!";
        return lineToPrint;
    }
}

