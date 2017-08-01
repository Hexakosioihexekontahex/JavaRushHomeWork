package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1adr = reader.readLine();
        String file2adr = reader.readLine();
        FileInputStream file1 = new FileInputStream(file1adr);
        FileOutputStream file2 = new FileOutputStream(file2adr);
        List<Integer> list = new ArrayList<Integer>();
        while(file1.available()>0){
            list.add(file1.read());
        }
        for (int i = 0; i < list.size(); i++) {
            file2.write(list.get(list.size()-i-1));
        }
        reader.close();
        file1.close();
        file2.close();
    }
}
