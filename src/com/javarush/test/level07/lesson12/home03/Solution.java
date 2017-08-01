package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;

        ArrayList<Integer> iii = new ArrayList<Integer>();
        for(int i=0;i<20;i++){
            iii.add(Integer.parseInt(reader.readLine()));
        }
        maximum=0;
        minimum=999;

        for(int i=0;i<iii.size();i++){
            if(iii.get(i)>maximum){
                maximum=iii.get(i);
            }
            if(iii.get(i)<minimum){
                minimum=iii.get(i);
            }
        }
        //напишите тут ваш код


        System.out.print(maximum+" "+minimum);
    }
}
