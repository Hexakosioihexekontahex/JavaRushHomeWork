package com.javarush.test.level22.lesson13.task02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* Смена кодировки
В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла в кодировке UTF-8.
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        String fileWindows1251 = args[0];
        String fileUTF8 = args[1];
        FileInputStream fis = new FileInputStream(fileWindows1251);
        FileOutputStream fos = new FileOutputStream(fileUTF8);
        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        String s = new String(buffer, "UTF-8");
        fos.write(s.getBytes("Windows-1251"));
        fis.close();
        fos.close();
    }
}
