package com.javarush.test.level22.lesson18.big01;

/**
 * Created by ion on 13.07.2016.
 */
public class Tetris {

    public static Tetris game;

    public void run(){}
    public void step(){}

    private Field field;
    private Figure figure;

    public Field getField() {
        return field;
    }

    public Figure getFigure() {
        return figure;
    }

    public static void main(String[] args) {
        game = new Tetris();
        game.run();
    }
}
