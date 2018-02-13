package com.javarush.test.level05.lesson12.bonus03

import java.io.BufferedReader
import java.io.InputStreamReader

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

@Throws(Exception::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    var maximum = Integer.MIN_VALUE
    val count = Integer.parseInt(reader.readLine())
    if (count < 0 || count == 0) throw IllegalArgumentException("Здесь должно быть положительное число!")
    val massive = IntArray(count)
    for (i in 0 until count) {
        massive[i] = Integer.parseInt(reader.readLine())
        if (massive[i] > maximum) {
            maximum = massive[i]
        }
    }
    reader.close()
    println(maximum)
}