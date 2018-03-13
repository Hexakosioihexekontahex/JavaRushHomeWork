package com.javarush.test.level07.lesson12.home01

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.ArrayList

@Throws(IOException::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val iii = ArrayList<Int>()
    for (i in 0..9) {
        iii.add(Integer.parseInt(reader.readLine()))
    }
    for (i in iii.indices) {
        println(iii[9 - i])
    }
}