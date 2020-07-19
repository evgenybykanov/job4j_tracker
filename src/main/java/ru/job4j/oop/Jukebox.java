package ru.job4j.oop;

public class Jukebox {
    public static String music(int position) {
        String rsl = "Песня не найдена";
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String result = Jukebox.music(4);
        System.out.println(result);
    }
}


