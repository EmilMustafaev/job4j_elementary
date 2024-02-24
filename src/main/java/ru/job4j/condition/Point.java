package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double a = x2 - x1;
        double b = y2 - y1;
        double first = Math.pow(a, 2);
        double second = Math.pow(b, 2);
        double sum = first + second;
        double result = Math.sqrt(sum);
        return result;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(5, 6, 8, 9);
        double result2 = Point.distance(2, 4, 7, 1);
        System.out.println("Result (8-5) to (9-6) " + result1);
        System.out.println("Result (7-2) to (1-4) " + result2);

    }
}
