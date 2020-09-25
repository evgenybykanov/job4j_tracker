package ru.job4j.ex;

public class Fact {
    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("the method is called from an object in an incorrect state");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        System.out.println(n);
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(calc(-5));
    }
}