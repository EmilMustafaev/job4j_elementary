package ru.job4j.condition;

public class TriangleArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double one = p - a;
        double two = p - b;
        double three = p - c;
        double four = p * one * two * three;
        double result = Math.sqrt(four);
        return result;
    }

    public static void main(String[] args) {
        double result = TriangleArea.area(5, 5, 5);
        System.out.println("area (5 , 5 , 5) = " + result);
    }
}
