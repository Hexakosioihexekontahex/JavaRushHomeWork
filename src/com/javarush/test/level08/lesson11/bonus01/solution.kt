package com.javarush.test.level08.lesson11.bonus01

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.HashMap

fun main(args: Array<String>) {
    val s = readText()
    val map = mapCreate()
    searchMonth(s, map)
}

private fun searchMonth(s: String, map: Map<String, Int>) {
    for ((key, value) in map) {
        if (key.contains(s)) {
            println("$key is $value month")
        }
    }
}

private fun mapCreate(): Map<String, Int> {
    val map = HashMap<String, Int>()

    map.apply {
        this["January"] = 1
        this["February"] = 2
        this["March"] = 3
        this["April"] = 4
        this["May"] = 5
        this["June"] = 6
        this["July"] = 7
        this["August"] = 8
        this["September"] = 9
        this["October"] = 10
        this["November"] = 11
        this["December"] = 12
    }

    return map
}

@Throws(IOException::class)
private fun readText(): String {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    return reader.readLine()
}
