package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        String fileName = args[1];
        String fileOutputName = args[2];
        try{
            crypt(fileName, fileOutputName);
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Error!");
        }
    }

    public static void crypt(String fileName, String fileOutputName) throws IOException{
        FileInputStream fis = new FileInputStream(fileName);
        FileOutputStream fos = new FileOutputStream(fileOutputName);
        while (fis.available()>0){
            int data = fis.read();
            fos.write(data^5);
        }
        fis.close();
        fos.close();
    }

}
