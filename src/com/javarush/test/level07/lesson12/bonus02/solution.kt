package com.javarush.test.level07.lesson12.bonus02

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.ArrayList

@Throws(IOException::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val list = ArrayList<String>()
    while (true) {
        val s = reader.readLine()
        if (s.isEmpty()) break
        list.add(s)
    }

    val listDoubleTriple = ArrayList<String>()
    for (i in list.indices) {
        val s = when {
            (list[i].length % 2 == 0) -> "${list[i]} ${list[i]}"
            else -> "${list[i]} ${list[i]} ${list[i]}"
        }

        listDoubleTriple.add(s)
    }
    for (s in listDoubleTriple) {
        println(s)
    }
}