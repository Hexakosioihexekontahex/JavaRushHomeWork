package com.javarush.test.level06.lesson11.bonus03

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*


/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

@Throws(Exception::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val fiveIntegers = ArrayList<Int>()
    try {
        for (i in 0..4) {
            fiveIntegers.add(Integer.parseInt(reader.readLine()))
        }
    } catch (e: IOException) {
    } finally {
        reader.close()
    }

    Collections.sort(fiveIntegers)
    for (i in fiveIntegers) {
        println(i)
    }
}