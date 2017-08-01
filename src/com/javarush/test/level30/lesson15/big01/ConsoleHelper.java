package com.javarush.test.level30.lesson15.big01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ion on 18.08.2016.
 */
public class ConsoleHelper {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static String readString(){
        String s = "";
        while (true){
            try{
                s = reader.readLine();
            } catch (IOException e){
                writeMessage("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
                continue;
            }
            break;
        }
        return s;
    }

    public static int readInt(){
        int i = 0;
        while (true){
            try{
                i = Integer.parseInt(readString());
            } catch (NumberFormatException e){
                writeMessage("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
                continue;
            }
            break;
        }
        return i;
    }

}
