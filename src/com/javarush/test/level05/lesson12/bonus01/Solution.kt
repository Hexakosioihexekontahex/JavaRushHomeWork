package com.javarush.test.level05.lesson12.bonus01

import java.io.BufferedReader
import java.io.InputStreamReader

@Throws(Exception::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val a = Integer.parseInt(reader.readLine())
    val b = Integer.parseInt(reader.readLine())

    reader.close()

    val sum = a + b
    println("Sum = $sum")
}