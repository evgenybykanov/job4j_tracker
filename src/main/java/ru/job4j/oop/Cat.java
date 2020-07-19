package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.print(this.name);
        System.out.print(" eat ");
        System.out.println(this.food);

    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }


    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("kotleta");
        gav.show();

        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Black");
        black.show();
    }
}

