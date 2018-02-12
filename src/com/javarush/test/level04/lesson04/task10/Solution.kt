package com.javarush.test.level04.lesson04.task10

import java.io.BufferedReader
import java.io.InputStreamReader


@Throws(Exception::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val sa = reader.readLine()
    val sb = reader.readLine()
    val sc = reader.readLine()
    val a = Integer.parseInt(sa)
    val b = Integer.parseInt(sb)
    val c = Integer.parseInt(sc)

    when {
        (a == b && a == c) -> println("$a $b $c")
        (a == b) -> println("$a $b")
        (a == c) -> println("$a $c")
        (b == c) -> println("$b $c")
    }

}