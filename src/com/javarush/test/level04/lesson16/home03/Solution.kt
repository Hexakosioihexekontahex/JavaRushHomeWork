package com.javarush.test.level04.lesson16.home03

import java.io.BufferedReader
import java.io.InputStreamReader

@Throws(Exception::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    var a = 0
    var b = 0
    while (a != -1) {
        a = Integer.parseInt(reader.readLine())
        b += a
    }
    reader.close()
    print(b)
}