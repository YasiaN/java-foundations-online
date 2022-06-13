package ru.itsjava.oop;

public class CountyToTravel {
//поля
    private String name;
    private boolean isEnglishNativeLanguage=true;
    int population;

    // конструктор

    public CountyToTravel (String name){
        this.name=name;
        this.isEnglishNativeLanguage = isEnglishNativeLanguage;
        this.population= population;
    }

    //методы
public String toString () {
        return "new destination is  "+name+ " isEnglishNativeLanguage? " + isEnglishNativeLanguage ;
}

public int getPopulation () {
        return population;
}

public void setPopulation (int population) {
    this.population=population;
}


}
