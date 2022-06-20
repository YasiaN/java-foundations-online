package ru.itsjava.statics;

public class StaticPractice {
    public static void main(String[] args) {

//        System.out.println("Salary.increaseCoefficient = " + Salary.increaseCoefficient);

//Salary cleanerSalary = new Salary(5_000.0);
//Salary targetSalary = new Salary(10_000);
//
//        System.out.println("cleanerSalary.getFullSalary() = " + cleanerSalary.getFullSalary());
//        System.out.println("targetSalary.getFullSalary() = " + targetSalary.getFullSalary());
//
//        Salary.setIncreaseCoefficient(1.0);
//        System.out.println("cleanerSalary.getFullSalary() = " + cleanerSalary.getFullSalary());
//        System.out.println("targetSalary.getFullSalary() = " + targetSalary.getFullSalary());
//
//        System.out.println("Salary.CEO = " + Salary.SALARY_CEO);

// И увидеть, что стоимость одна и та же не зависимо от того Бентли это или Жигули.

        Car bently = new Car("bently","blue");
        Car shiguli = new Car("shiguli", "red");

        System.out.println("bently.PRICE = " + bently.PRICE);
        System.out.println("shiguli.PRICE = " + shiguli.PRICE);

        System.out.println("Circle.PI_CONSTANT = " + Circle.PI_CONSTANT);

    }
}
