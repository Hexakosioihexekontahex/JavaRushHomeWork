package com.javarush.test.level07.lesson04.task01

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

@Throws(Exception::class)
fun main(args: Array<String>) {
    val array = initializeArray()
    val max = max(array)
    println(max)
}

@Throws(IOException::class)
fun initializeArray(): IntArray {
    val arr = IntArray(20)
    val reader = BufferedReader(InputStreamReader(System.`in`))
    for (i in arr.indices) {
        arr[i] = Integer.parseInt(reader.readLine())
    }
    return arr
}

fun max(array: IntArray): Int {
    var max = array[0]
    array.indices
            .asSequence()
            .filter { array[it] > max }
            .forEach { max = array[it] }
    return max
}