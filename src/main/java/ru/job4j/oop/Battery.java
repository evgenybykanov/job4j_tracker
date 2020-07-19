package ru.job4j.oop;

public class Battery {
    private int value;

    public Battery(int charge) {
        this.value = charge;
    }

    public void pour(Battery another) {
        this.value = this.value + another.value;
        another.value = 0;
    }
    public static void main(String[] args) {
        Battery first = new Battery(60);
        Battery second = new Battery(40);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);

    }
}