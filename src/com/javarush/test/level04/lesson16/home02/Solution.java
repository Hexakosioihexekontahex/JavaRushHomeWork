package com.javarush.test.level04.lesson16.home02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sa = reader.readLine();
        String sb = reader.readLine();
        String sc = reader.readLine();
        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);
        if (a>b&&b>c||a<b&&b<c) {
            System.out.println(b);
        } else if (a>c&&c>b||a<c&&c<b) {
            System.out.println(c);
        } else if (b>a&&a>c||b<a&&a<c) {
            System.out.println(a);
        }
    }
}
