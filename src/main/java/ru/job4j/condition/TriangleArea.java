package ru.job4j.condition;

public class TriangleArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double result = TriangleArea.area(5, 5, 5);
        System.out.println("area (5 , 5 , 5) = " + result);
    }
}
