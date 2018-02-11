package com.javarush.test.level04.lesson06.task05

import java.io.BufferedReader
import java.io.InputStreamReader

@Throws(Exception::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val n = reader.readLine()
    val s = reader.readLine()
    reader.close()
    val a = Integer.parseInt(s)
    if (a < 18) {
        print("Подрасти еще, $n")
    }

}