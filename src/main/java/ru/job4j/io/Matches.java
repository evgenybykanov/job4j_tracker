package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 11;
        boolean player = true;
        String name = "";
        while (true) {
            name = player ? "Player1" : "Player2";
            System.out.println(name + " возмите спичек от 1 до 3: ");
            int select = Integer.parseInt(input.nextLine());
            while (select < 1 || select > 3) {
                System.out.println("Так нельзя!Повторите попытку.");
                select = Integer.parseInt(input.nextLine());
            }
            count = count - select;
            if (count <= 0) {
                break;
            }
            System.out.println("Oсталось: " + count + " спичек");
            player = !player;
        }
        System.out.println(String.format("Победу одержал !  " + name));
    }
}