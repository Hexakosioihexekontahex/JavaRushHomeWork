package com.javarush.test.level20.lesson10.home07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* Переопределение сериализации в потоке
Сериализация/десериализация Solution не работает.
Исправьте ошибки не меняя сигнатуры методов и класса.
Метод main не участвует в тестировании.
Написать код проверки самостоятельно в методе main:
1) создать экземпляр класса Solution
2) записать в него данные  - writeObject
3) сериализовать класс Solution  - writeObject(ObjectOutputStream out)
4) десериализовать, получаем новый объект
5) записать в новый объект данные - writeObject
6) проверить, что в файле есть данные из п.2 и п.5
*/
public class Solution implements Serializable, AutoCloseable {
    public static void main(String[] args) throws Exception {
        Solution solution1 = new Solution("D:\\1.txt");
        solution1.writeObject("Hi1");
        solution1.close();

        FileOutputStream fos = new FileOutputStream("D:\\2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(solution1);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("D:\\2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Solution solution2 = (Solution) ois.readObject();
        ois.close();
        solution2.writeObject("Hi2");
        solution2.writeObject("Hi3");
        solution2.close();
    }

    transient private FileOutputStream stream;
    private String fileName;
    public Solution(String fileName) throws FileNotFoundException {
        this.fileName=fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(this.fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

}
