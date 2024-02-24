package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womenWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short height = 180;
        double man = Fit.manWeight(height);
        double women = Fit.womenWeight(height);
        System.out.println("Man 180 is: " + man);
        System.out.println("Woman 180 is: " + women);
    }
}
