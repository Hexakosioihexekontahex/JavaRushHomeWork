package com.javarush.test.level23;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by ion on 21.07.2016.
 * Класс для выявления методов любого класса
 */
public class GetMethods {
    static void getMethods(Object target){
        Class clazz = target.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for(Method m:methods){
            System.out.println(Modifier.toString(m.getModifiers()) +" "+ m.getName());
        }
    }

    public static void main(String[] args) {
        getMethods(new Object()); //Object меняешь на класс-цель
    }
}