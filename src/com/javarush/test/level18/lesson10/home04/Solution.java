package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
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
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();
        reader.close();

        FileInputStream file1 = new FileInputStream(fileOne);
        FileInputStream file2 = new FileInputStream(fileTwo);

        byte[] buffer1 = new byte[file1.available()];
        file1.read(buffer1);
        file1.close();

        byte[] buffer2 = new byte[file2.available()];
        file2.read(buffer2);
        file2.close();

        FileOutputStream fileOut = new FileOutputStream(fileOne);
        fileOut.write(buffer2);
        fileOut.close();

        FileOutputStream fileOutTwo = new FileOutputStream(fileOne, true);
        fileOutTwo.write(buffer1);
        fileOutTwo.close();

    }
}
