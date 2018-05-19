package com.javarush.test.level08.lesson11.bonus02

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.HashMap

@Throws(IOException::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val map = HashMap<String, String>()
    while (true) {
        val s1 = reader.readLine()
        if (s1.isEmpty()) {
            break
        }
        val s2 = reader.readLine()
        map[s1] = s2
    }

    val city = reader.readLine()
    for ((key, value) in map) {
        if (key == city) {
            println(value)
        }
    }
}