package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Fox fox = new Fox();
        Wolf wolf = new Wolf();
        Hare hare = new Hare();
        Ball ball = new Ball();
        wolf.tryEat(ball);
        ball.song();
        hare.tryEat(ball);
        ball.song();
        fox.tryEat(ball);
        ball.song();
        fox.eat(ball);
    }
}
