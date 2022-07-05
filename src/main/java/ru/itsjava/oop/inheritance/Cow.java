package ru.itsjava.oop.inheritance;

public class Cow implements Talkable,Eatable{

    @Override
    public String giveTalk () {
        String talk ="Муууууу!!!";
        return talk;
    }

    @Override
    public String giveFood () {
        String food="Дай сено, пожалуйста!";
        return food;
    }
}
