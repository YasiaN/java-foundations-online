package ru.itsjava.oop.inheritance;

public class Man implements Talkable, Eatable {

    @Override
    public String giveTalk() {
        String talk = "Пойдём, надо поговорить";
        return talk;
    }
    @Override
    public String giveFood (){
        String s="Возьми еду из холодильника.";
        return s;
    }

}
