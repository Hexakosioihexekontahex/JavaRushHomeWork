package com.javarush.test.level05.lesson12.bonus02

import java.io.BufferedReader
import java.io.InputStreamReader

@Throws(Exception::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val a = Integer.parseInt(reader.readLine())
    val b = Integer.parseInt(reader.readLine())
    val c = Integer.parseInt(reader.readLine())
    val d = Integer.parseInt(reader.readLine())
    val e = Integer.parseInt(reader.readLine())

    reader.close()

    val minimum = min(a, b, c, d, e)

    println("Minimum = $minimum")
}


fun min(a: Int, b: Int): Int {
    return if (a < b) a else b
}

fun min(a: Int, b: Int, c: Int, d: Int, e: Int): Int {
    val massive = IntArray(5)
    massive[0] = a
    massive[1] = b
    massive[2] = c
    massive[3] = d
    massive[4] = e
    var min = Integer.MAX_VALUE
    massive.indices
            .asSequence()
            .filter { massive[it] < min }
            .forEach { min = massive[it] }
    return min
}