package com.javarush.test.level14.lesson08.home05;

/*
 3. Создай классы Keyboard, Mouse, Monitor, которые реализуют интерфейс CompItem.
 */
public class Mouse implements CompItem
{

    @Override
    public String getName()
    {
        return "Mouse";
    }
}