package ru.job4j.oop;

public class DummyDic {
    public static String engToRus() {
        String answer = "известное слово";
        return answer;
    }

    public static void main(String[] args) {
        DummyDic bot = new DummyDic();
        String say = bot.engToRus();
        System.out.println("Java " + say);
    }
}
