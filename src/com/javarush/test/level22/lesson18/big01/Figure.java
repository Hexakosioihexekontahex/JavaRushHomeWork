package com.javarush.test.level22.lesson18.big01;

/**
 * Created by ion on 13.07.2016.
 */
public class Figure {

    /*Задание 8
Теперь создадим костяк класса Figure.
Этот класс будет описывать падающую фигурку.

Нам понадобятся ее координаты и форма.
За координаты будут отвечать две переменные x и y.
За форму - матрица. Двумерный массив 3x3, состоящий из единиц и нулей.
Единицей мы обозначаем что клетка есть, нулем - что она пустая.

Добавь в класс Figure два поля поля: x типа int, y типа int.
Еще добавь двумерный массив: matrix(матрица) типа int[][].
Там же добавь getter'ы для созданных переменных.
Добавь конструктор с тремя параметрами x, y, matrix.*/
    private int[][] matrix;
    private int x;
    private int y;
    private Figure(int x, int y, int[][] matrix){
        this.x=x;
        this.y=y;
        this.matrix=matrix;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void left(){
        x--;
        if(!isCurrentPositionAvailable()) x++;
    }
    public void right(){
        x++;
        if(!isCurrentPositionAvailable()) x--;
    }
    public void down(){
        y++;
    }
    public void up(){
        y--;
    }
    public void downMaximum(){}
    public void rotate(){}
    public boolean isCurrentPositionAvailable(){return true;}
    public void landed(){
        Field field = Tetris.game.getField();

    }
}
