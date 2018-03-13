package com.javarush.test.level07.lesson12.bonus03

import java.io.BufferedReader
import java.io.InputStreamReader

@Throws(Exception::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val array = IntArray(20)
    for (i in 0..19) {
        array[i] = Integer.parseInt(reader.readLine())
    }

    sort(array)

    for (x in array) {
        println(x)
    }
}

fun sort(array: IntArray) {
    for (i in 0 until array.size - 1) {
        for (s in 0 until array.size - i - 1) {
            if (array[s] < array[s + 1]) {
                val tmp = array[s]
                array[s] = array[s + 1]
                array[s + 1] = tmp
            }
        }
    }
}