package com.javarush.test.level03.lesson01.task01

/* Реализация метода
Реализуйте метод public static void div(int a, int b).
Метод должен делить первое число на второе, и выводить на экран результат деления а / b.
*/

fun div(a: Int, b: Int){
    println(a / b)
}

fun main(args: Array<String>) {
    div(6, 3)
    div(10, 6)
    div(2, 4)

    6 infixDiv 3
    10 infixDiv 6
    2 infixDiv 4
}

infix fun Int.infixDiv(a: Int) {
    println(this / a)
}