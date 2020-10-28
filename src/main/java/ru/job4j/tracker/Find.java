package ru.job4j.tracker;

public class Find {
    public static String get(String[] data, int index) {
        if (index > data.length) {
            throw new IllegalArgumentException("Index out of bound");
        }
        return data[index];
    }

    public static void main(String[] args) {
        String[] data = {"one", "two", "three"};
        String rsl = Find.get(data, 4);
        System.out.println(rsl);
    }
}
