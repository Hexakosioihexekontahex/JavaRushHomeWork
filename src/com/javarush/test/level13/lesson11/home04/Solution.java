package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outStream = new FileOutputStream("D:/my-text.txt");
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            list.add(reader.readLine());
            if(list.get(i).contains("exit")){break;} моё недоделанное решение
        }

        for (int i = 0; i < list.size(); i++) {
            outStream.write(list.get(i));
        }*/
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter( new OutputStreamWriter( new FileOutputStream(reader.readLine())));

        String next;
        do
        {
            next = reader.readLine();
            writer.write(next);

            if (!next.equals("exit"))
            {
                writer.newLine();
            }
            else break;
        }
        while (!next.equals("exit"));
        reader.close();
        writer.close();
    }
}
