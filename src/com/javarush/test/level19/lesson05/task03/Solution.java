package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader fileRead = new BufferedReader(new FileReader(file1));
        BufferedWriter fileWrite = new BufferedWriter(new FileWriter(file2));

        while(fileRead.ready()){
            String str = fileRead.readLine();
            String[] wordArray = str.split(" ");
            for (int i = 0; i < wordArray.length; i++) {
                if(checkString(wordArray[i]))
                    fileWrite.write(wordArray[i] + " ");
            }
        }
        fileRead.close();
        fileWrite.close();
    }

    public static boolean checkString(String string){
        if(string==null||string.length()==0) return false;

        int i = 0;
        if(string.charAt(0) == '-'){
            if(string.length()==1){
                return false;
            }
            i=1;
        }
        char c;
        for(;i<string.length();i++){
            c = string.charAt(i);
            if(!(c>='0'&&c<='9')){
                return false;
            }
        }
        return true;
    }
}
