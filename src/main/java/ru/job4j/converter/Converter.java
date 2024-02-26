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
     float input1 = 210;
     float expected1 = 3;
     float output1 = Converter.rubleToEuro(input1);
     boolean passed1 = expected1 == output1;
     float input2 = 120;
     float expected2 = 2;
     float output2 = Converter.rubleToDollar(input2);
     boolean passed2 = expected2 == output2;
        System.out.println("210 rubles are 3. Test result: " + passed1);
        System.out.println("120 rubles are 2. Test result: " + passed2);
    }
}
