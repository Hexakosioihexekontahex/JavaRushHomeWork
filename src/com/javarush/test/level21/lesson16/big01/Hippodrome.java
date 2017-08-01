package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

public class Hippodrome {
    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome();

        game.horses.add(new Horse("horse1", 3, 0));
        game.horses.add(new Horse("horse2", 3, 0));
        game.horses.add(new Horse("horse3", 3, 0));

        game.run();
    }

    public static Hippodrome game;

    private ArrayList<Horse> horses = new ArrayList<>();

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
    public void move(){
        for (Horse horse : getHorses()) {
            horse.move();
        }
    }
    public void print(){
        for (Horse horse : getHorses()) {
            horse.print();
            System.out.println();
            System.out.println();
        }
    }

}
