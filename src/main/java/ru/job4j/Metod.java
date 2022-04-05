package ru.job4j;

public class Metod {

    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result1 = Metod.func1(3);
        int result2 = Metod.func2(5);
        int total = result1 + result2;
        System.out.println(total);
        int result3 = Metod.func1(100);
    }
}