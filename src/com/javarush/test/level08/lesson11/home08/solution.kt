package com.javarush.test.level08.lesson11.home08

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

@Throws(Exception::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val array = arrayOfNulls<Int>(20) //при сортировке массива при помощи метода sort() из класса Arrays нужно использовать тип Integer[] вместо примитивного типа int[].
    for (i in array.indices) {
        //array[i] = (int)(Math.random() * 100);
        array[i] = Integer.parseInt(reader.readLine())
    }

    sort(array)

    println(array[0])
    println(array[1])
    println(array[2])
    println(array[3])
    println(array[4])
}

fun sort(array: Array<Int?>) {
    Arrays.sort(array, Collections.reverseOrder()) //Сортировка массива при помощи метода sort() из класса Arrays
}