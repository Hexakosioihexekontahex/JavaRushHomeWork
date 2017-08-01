package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileR = new FileReader(reader.readLine());
        FileWriter fileW = new FileWriter(reader.readLine());
        reader.close();
        int i=0;
        while(fileR.ready()){
            i++;
            int data=fileR.read();
            if(i%2==0){
                fileW.write(data);
            }
        }
        fileR.close();
        fileW.close();
    }
}
