package com.javarush.test.level08.lesson11.home04

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*

@Throws(Exception::class)
fun main(args: Array<String>) {
    val integerList = getIntegerList()
    println(getMinimum(integerList))
}

fun getMinimum(array: List<Int>): Int {
    return Integer.parseInt(Collections.min(array).toString())
}

@Throws(IOException::class)
fun getIntegerList(): List<Int> {
    val list = ArrayList<Int>()
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val n = Integer.parseInt(reader.readLine())
    for (i in 0 until n) {
        list.add(Integer.parseInt(reader.readLine()))
    }
    return list
}