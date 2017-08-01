package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream fileTwo = new FileInputStream(file2);
        FileInputStream fileThree = new FileInputStream(file3);
        FileOutputStream fileOne = new FileOutputStream(file1);

        while(fileTwo.available()>0){
            int data = fileTwo.read();
            fileOne.write(data);
        }

        while(fileThree.available()>0){
            int data = fileThree.read();
            fileOne.write(data);
        }

        reader.close();
        fileOne.close();
        fileTwo.close();
        fileThree.close();

    }
}
