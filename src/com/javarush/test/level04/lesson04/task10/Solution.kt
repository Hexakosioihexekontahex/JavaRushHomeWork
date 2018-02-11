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
    if (a == b && a == c) {
        // TODO Need do refactoring later (chapter03 2nd) in connection with the idiomatics of Kotlin (if else if else if else...)
        println("$a $b $c")
    } else if (a == b) {
        println("$a $b")
    } else if (a == c) {
        println("$a $c")
    } else if (b == c) {
        println("$b $c")
    }

}