package com.javarush.test.level08.lesson11.bonus03

import java.io.BufferedReader
import java.io.InputStreamReader

@Throws(Exception::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val array = arrayOfNulls<String>(20)
    for (i in array.indices) {
        array[i] = reader.readLine()
    }

    sort(array)

    for (x in array) {
        println(x)
    }
}

fun sort(array: Array<String?>) {
    for (y in 0..array.size) {
        if(array[y] == null) {
            array[y] = ""
        }
    }
    var i = 0
    while (i < array.size - 1) {
        val s = i + 1
        var temp: String?
        if (isGreaterThan(array[i], array[s])) {
            temp = array[s]
            array[s] = array[i]
            array[i] = temp
            if (i > 0) i--
        } else
            i++

    }
}

fun isGreaterThan(a: String?, b: String?): Boolean {
    if (a == null || b == null) {
        throw IllegalArgumentException()
    }
    return a > b
}