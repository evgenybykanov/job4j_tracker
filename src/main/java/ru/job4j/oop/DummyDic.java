package ru.job4j.oop;

public class DummyDic {
    public static String engToRus(String word) {
        String answer = "известное слово";
        return answer + word;
    }

    public static void main(String[] args) {
        DummyDic bot = new DummyDic();
        String say = bot.engToRus(" Java");
        System.out.println(say);
    }
}
