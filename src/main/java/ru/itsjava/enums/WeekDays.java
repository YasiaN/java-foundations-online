package ru.itsjava.enums;

// 1. Создать Перечисление Дни недели
public enum WeekDays {
    Monday("Понедельник"), Tuesday("Вторник"), Wednesday("Среда"),
    Thursday("Четверг"), Friday("Пятница"), Saturday("Суббота"), Sunday("Воскресенье");

//    2. Создать конструктор с входящим параметром переводом дня недели

    private final String characteristics;

    WeekDays(String characteristics) {
        this.characteristics = characteristics;

    }


    public String getCharacteristics() {
        return characteristics;
    }

    @Override
    public String toString() {
        return "WeekDays{" +
                "characteristics='" + characteristics + '\'' +
                '}';
    }
}

