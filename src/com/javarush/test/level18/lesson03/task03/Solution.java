package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        ArrayList<Integer> byteList = new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        String result="";
        FileInputStream file = new FileInputStream(fileName);
        while(file.available()>0){
            int data = file.read();
            byteList.add(data);
        } file.close();
        int[] count= new int[byteList.size()];
        for (int i = 0; i < byteList.size(); i++) {
            count[i]=0;
            for (int j = 0; j < byteList.size(); j++) {
                if(byteList.get(i)==byteList.get(j)){
                    count[i]++;
                }
            }
        }

        int max=Integer.MIN_VALUE;
        for(int h: count){
            if (h>max){max=h;}
        }
        for (int i = 0; i < byteList.size(); i++) {
            if (!res.contains(byteList.get(i)) && count[i] == max) {
                res.add(byteList.get(i));
            }
        }
        for(int y: res){
            result = y+" ";
        }
        System.out.println(result);
    }
}
