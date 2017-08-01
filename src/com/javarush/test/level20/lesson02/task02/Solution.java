package com.javarush.test.level20.lesson02.task02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush
В файле your_file_name.tmp может быть несколько объектов JavaRush
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user1 = new User();
            user1.setFirstName("Kolya");
            user1.setLastName("Golubkov");
            user1.setBirthDate(dateFormat.parse("21.01.1988"));
            user1.setCountry(User.Country.RUSSIA);
            user1.setMale(true);

            User user2 = new User();
            user2.setFirstName("Masha");
            user2.setLastName(null);
            user2.setBirthDate(dateFormat.parse("02.11.1995"));
            user2.setCountry(User.Country.UKRAINE);
            user2.setMale(false);
            javaRush.users.add(user1);
            javaRush.users.add(user2);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer = new PrintWriter(outputStream);
            for(User user:users){
                writer.println("@");
                String firstName = user.getFirstName();
                if(firstName==null){
                    firstName="noName";
                }
                writer.println(firstName);
                String lastName=user.getLastName();
                if(lastName==null){
                    lastName="noLastName";
                }
                writer.println(lastName);
                writer.println(dateFormat.format(user.getBirthDate()));
                writer.println(String.valueOf(user.isMale()));
                writer.println(user.getCountry());
            }
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while(reader.ready()){
                String newUser = reader.readLine();
                if(newUser.equals("@")){
                    User user = new User();
                    String name = reader.readLine();
                    if(name.equals("noName")){
                        name=null;
                    }
                    user.setFirstName(name);
                    String surname = reader.readLine();
                    if(surname.equals("noLastName")){
                        surname=null;
                    }
                    user.setLastName(surname);
                    user.setBirthDate(dateFormat.parse(reader.readLine()));
                    if(reader.readLine().equals("true")){
                        user.setMale(true);
                    } else user.setMale(false);
                    user.setCountry(User.Country.valueOf(reader.readLine()));
                    users.add(user);
                }
            }
        }
    }
}
