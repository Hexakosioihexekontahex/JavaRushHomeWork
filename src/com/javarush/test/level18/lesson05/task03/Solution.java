package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
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
        String file3adr = reader.readLine();
        FileInputStream file1 = new FileInputStream(file1adr);
        List<Integer> list = new ArrayList<Integer>();

        while(file1.available()>0){
            list.add(file1.read());
        }
        FileOutputStream file2 = new FileOutputStream(file2adr);
        FileOutputStream file3 = new FileOutputStream(file3adr);

        int sz=(list.size()+1)/2;
        for (int i = 0; i < sz; i++) {
            file2.write(list.get(i));
        }
        for (int i = sz; i < list.size(); i++) {
            file3.write(list.get(i));
        }

        file1.close();
        file2.close();
        file3.close();
        reader.close();
    }
}
