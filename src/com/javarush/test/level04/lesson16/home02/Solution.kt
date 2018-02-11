package com.javarush.test.level04.lesson16.home02

import java.io.BufferedReader
import java.io.InputStreamReader

@Throws(Exception::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val sa = reader.readLine()
    val sb = reader.readLine()
    val sc = reader.readLine()
    reader.close()
    val a = Integer.parseInt(sa)
    val b = Integer.parseInt(sb)
    val c = Integer.parseInt(sc)
    if (b in (c + 1)..(a - 1) || b in (a + 1)..(c - 1)) {
        println(b)
    } else if (c in (b + 1)..(a - 1) || c in (a + 1)..(b - 1)) {
        println(c)
    } else if (a in (c + 1)..(b - 1) || a in (b + 1)..(c - 1)) {
        println(a)
    }
}