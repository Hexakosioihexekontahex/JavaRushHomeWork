package com.javarush.test.level08.lesson06.task01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Создать два списка LinkedList и ArrayList
Нужно создать два списка – LinkedList и ArrayList.
*/

public class Solution
{
    public static void main(String[] args) throws IOException {
        createArrayList();
        createLinkedList();
    }

    public static Object createArrayList()
    {
        List<Object> list = new ArrayList<Object>();
        return list;
        //напишите тут ваш код

    }

    public static Object createLinkedList()
    {
        List<Object> list = new LinkedList<Object>();
        return list;
        //напишите тут ваш код

    }
}
