package com.javarush.test.level06.lesson11.bonus01

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

@Throws(IOException::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val a = Integer.parseInt(reader.readLine())
    val b = Integer.parseInt(reader.readLine())
    reader.close()

    println("Max is ${if (a > b) a else b}")
}