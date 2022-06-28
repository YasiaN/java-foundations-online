package ru.itsjava.comparable;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Person implements Comparable<Person> , Clonable {
    public String name;
    public String surname;
    public int age;

    // Реализовать метод compareTo(), который будет сравнивать человека по фамилии,
    // если фамилии одинаковые, то по имени, в ином случае по возрасту.


    @Override
    public int compareTo(Person o) {
        if (surname.equals(o.surname)) {
            System.out.println("Фамилии людей одинаковые. Относительно сравнения возраста и имён - неизвестно");
        } else if (name.equals(o.name)) {
            System.out.println("Имена людей одинаковые.Фамилии людей разные,относительно сравнения возрасна - неизвестно");
        } else if (age == o.age) {
            System.out.println("Возраст одинаковый.Фамилии и имена людей разные.");
        }
        return age - o.age;
    }

    @Override
    public String toString() {
        return "Person:{ name: " + name + ", surname: " + surname + " age:" + age + "}";
    }

//    4. В классе Person реализовать метод clone()

//    @Override
//    protected Object clone () throws CloneNotSupportedException {
//       return  super.clone();
//    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
}
