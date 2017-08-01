package com.javarush.test.level26.lesson15.big01;

import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ion on 03.08.2016.
 */
public class ConsoleHelper {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void writeMessage(String message){
        System.out.println(message);
    }
    public static String readString() throws InterruptOperationException{
        String s = "";
        try{
            s = reader.readLine();
            if(s.equalsIgnoreCase("EXIT")){
                throw new InterruptOperationException();
            }
        } catch (IOException e){}
        return s;
    }

    public static Operation askOperation() throws InterruptOperationException{
        while (true){
            String line = readString();
            if(checkWithRegExp(line)){
                return Operation.getAllowableOperationByOrdinal(Integer.parseInt(line));
            } else {
                writeMessage("wrong input, try again.");
            }
        }
    }

    public static boolean checkWithRegExp(String name){
        Pattern p = Pattern.compile("^[1-4]$");
        Matcher m = p.matcher(name);
        return m.matches();
    }

    public static String askCurrencyCode() throws InterruptOperationException{
        System.out.println("write currency code");
        String s = "";
        while (true){
            s = readString();
            if(s.length() == 3){
                break;
            } else {
                System.out.println("wrong currency code");
            }
        }
        s = s.toUpperCase();
        return s;
    }

    public static String[] getValidTwoDigits(String currencyCode) throws InterruptOperationException {
        String[] array;
        System.out.println("write the denomination and number of banknotes (111 222)");
        while (true){
            String s = readString();
            array = s.split(" ");
            int k;
            int l;
            try{
                k = Integer.parseInt(array[0]);
                l = Integer.parseInt(array[1]);
            } catch (Exception e){
                System.out.println("wrong input, try again.");
                continue;
            }
            if( k <= 0 || l <= 0 || array.length > 2 ) {
                System.out.println("wrong input, try again.");
                continue;
            }
            break;
        }
        return array;
    }
}
