package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(600);
        float dollar = Converter.rubleToDollar(1500);
        System.out.println("600 rubles are " + euro + " euro.");
        System.out.println("1500 rubles are " + dollar + " dollar.");
    }
}