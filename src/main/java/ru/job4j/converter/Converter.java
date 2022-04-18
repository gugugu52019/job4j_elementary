package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value2) {
        float rsl = value2 / 65;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float expectedEuro = 2;
        boolean passedeuro = expectedEuro == euro;
        System.out.println("Test result: " + passedeuro);

        float dollar = Converter.rubleToDollar(195);
        System.out.println("140 rubles are " + dollar + " dollars.");
        float expectedDollar = 3;
        boolean passedDollar = expectedDollar == dollar;
        System.out.println("Test result: " + passedDollar);
    }
}