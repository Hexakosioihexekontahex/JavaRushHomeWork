package com.javarush.test.level14.lesson08.home05;

/*
 5. Создай класс Computer.
 6. В класс Computer добавь приватное поле типа Keyboard.
 7. В класс Computer добавь приватное поле типа Mouse.
 8. В класс Computer добавь приватное поле типа Monitor.
 */
public class Computer
{
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer()
    {
        keyboard = new Keyboard();
        mouse = new Mouse();
        monitor = new Monitor();
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }
}