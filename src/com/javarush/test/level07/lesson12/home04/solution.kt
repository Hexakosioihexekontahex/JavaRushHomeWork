package com.javarush.test.level07.lesson12.home04

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.ArrayList

@Throws(IOException::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val list = ArrayList<String>()
    list.add(reader.readLine())
    run {
        var i = 1
        while (list[i - 1] != "end") {
            list.add(reader.readLine())
            i++
        }
    }
    for (i in 0 until list.size - 1) {
        println(list[i])
    }
}