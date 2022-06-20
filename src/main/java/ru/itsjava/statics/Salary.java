package ru.itsjava.statics;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Salary {
    private final double baseSalary;
    private static double increaseCoefficient = 2.5;
    public final static double SALARY_CEO = 500_000.0;

    public double getFullSalary () {
        return baseSalary*increaseCoefficient;
    }

    public static void setIncreaseCoefficient (double increaseCoefficient1){
        increaseCoefficient=increaseCoefficient1;
    }



}
