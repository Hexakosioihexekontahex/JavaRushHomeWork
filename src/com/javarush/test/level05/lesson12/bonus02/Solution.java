package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }

    public static int min(int a, int b, int c, int d, int e){
        int[] massive = new int[5];
        massive[0] = a;
        massive[1] = b;
        massive[2] = c;
        massive[3] = d;
        massive[4] = e;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < massive.length; i++) {
            if(massive[i]<min){
                min = massive[i];
            }
        }
        return min;
    }

}
