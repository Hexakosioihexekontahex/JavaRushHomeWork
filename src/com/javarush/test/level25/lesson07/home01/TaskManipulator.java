package com.javarush.test.level25.lesson07.home01;

public class TaskManipulator implements Runnable, CustomThreadManipulator {
    public long startDate;
    public long stopDate;
    public String temp;

    @Override
    public void run() {

    }

    @Override
    public void start(String threadName) {
        temp = threadName;
        startDate = System.currentTimeMillis();
    }

    @Override
    public void stop() {
        stopDate = System.currentTimeMillis();
        if ((stopDate - startDate) >= 1) {
            System.out.println(temp);
            int size = (int) ((stopDate - startDate) / 100);
            for (int i = 0; i < size; i++) {
                System.out.println(temp);
            }
        }
    }
}