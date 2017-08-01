package com.javarush.test.level19.lesson10.home08;

/* Перевертыши
1 Считать с консоли имя файла.
2 Для каждой строки в файле:
2.1 переставить все символы в обратном порядке
2.2 вывести на экран
3 Закрыть потоки. Не использовать try-with-resources

Пример тела входного файла:
я - программист.
Амиго

Пример результата:
.тсиммаргорп - я
огимА
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        List<String> list = new ArrayList<String>();
        String input;
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        while((input=fileReader.readLine())!=null){
            list.add(input);
        }
        fileReader.close();
        List<String> resultList = new ArrayList<String>();
        for(String current:list){
            resultList.add(new StringBuilder().append(current).reverse().toString());
        }
        for(String current:resultList){
            System.out.println(current);
        }

    }

}
