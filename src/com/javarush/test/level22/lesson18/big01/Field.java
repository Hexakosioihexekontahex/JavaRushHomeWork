package com.javarush.test.level22.lesson18.big01;

/**
 * Created by ion on 13.07.2016.
 */
public class Field {
    private int width;
    private int height;
    private int[][] matrix;

    public Field(int width, int height){
        this.width=width;
        this.height =height;
        matrix = new int[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return matrix;
    }

//    Задание 7
//    Нам понадобится еще 4 метода в классе Field:
//    а) print() - объект будет отрисовывать на экран свое текущее состояние;
//    б) removeFullLines() - будет удалять из матрицы полностью заполненные строки и сдвигать вышележащие строки вниз;
//    в) Integer getValue(int x, int y) - возвращает значение которое находится в матрице с координатами x и y;
//    г) void setValue(int x, int y, int value) - устанавливает переданное значение в ячейку массива (матрицы) с координатами x, y.
    public void print(){
        int[][] situation = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                situation[i][j] = matrix[i][j];
            }
        }
    }

    public void removeFullLines(){

    }

    public Integer getValue(int x, int y){
        return null;
    }

    public void setValue(int x, int y, int value){

    }





}
