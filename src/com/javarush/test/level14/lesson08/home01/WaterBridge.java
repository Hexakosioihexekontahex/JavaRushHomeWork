package com.javarush.test.level14.lesson08.home01;

/**
 * Created by ion on 23.06.2016.
 2. Создать классы WaterBridge и SuspensionBridge, которые реализуют интерфейс Bridge.*/
public class WaterBridge implements Bridge{
    @Override
    public int getCarsCount(){
        return 100;
    }
}
