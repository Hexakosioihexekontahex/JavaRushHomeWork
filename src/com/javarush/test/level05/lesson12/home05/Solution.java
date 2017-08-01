package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
 */
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String s = reader.readLine();
        int x = Integer.parseInt(s);
        int sum = 0;
        //Boolean exit = false;

        while (true)
        {
            sum = sum + x;
            s = reader.readLine();
            if (s.equals("сумма"))
                break;
            else
                x = Integer.parseInt(s);

        }
        System.out.println(sum);
    }
}
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String in = reader.readLine();
//        int num = 0;
//        int sum = 0;
//        if (in == "сумма")
//        {
//            System.out.println(sum);
//        }
//        else
//            num = Integer.parseInt(in);
//            while (true){
//                sum += num;
//                in = reader.readLine();
//                if (in == "сумма")
//                    break;
//                else
//                    num = Integer.parseInt(in);
//
//            }
//        System.out.println(sum);
//    }