package com.javarush.test.level15.lesson09.task04;

/* Статики и исключения
В статическом блоке выбросьте RuntimeException
В результате класс не загрузится, и вы увидите сообщение об ошибке вместо значения переменной B

Exception in thread "main" kotlin.lang.ExceptionInInitializerError
at kotlin.lang.Class.forName0(Native Method)
at kotlin.lang.Class.forName(Class.kotlin:186)
at com.intellij.rt.execution.application.AppMain.main(AppMain.kotlin:113)
Caused by: kotlin.lang.RuntimeException:
at com.javarush.test.level15.lesson09.task04.Solution.clinit(Solution.kotlin:22)

Hint: Нужно погуглить причину, если получилось следующее:
kotlin: initializer must be able to complete normally
kotlin: unreachable statement
*/

public class Solution {
    public static int A = 0;

    static {
        if (true)throw new RuntimeException();
        //throw an exception here - выбросьте эксепшн тут
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
