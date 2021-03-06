package com.javarush.test.level22.lesson13.task01;

import java.util.ArrayList;
import java.util.StringTokenizer;

/* StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.
Пример,
getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
*/
public class Solution {
    public static String [] getTokens(String query, String delimiter) {
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            list.add(token);
        }
        String[] tokenized = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            tokenized[i]=list.get(i);
        }
        return tokenized;
    }
}
