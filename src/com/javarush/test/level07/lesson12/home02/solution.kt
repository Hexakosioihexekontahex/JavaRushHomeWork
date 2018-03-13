package com.javarush.test.level07.lesson12.home02

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.ArrayList

@Throws(IOException::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val n = Integer.parseInt(reader.readLine())
    val m = Integer.parseInt(reader.readLine())
    val sss = ArrayList<String>()
    for (i in 0 until n) {
        sss.add(reader.readLine())
    }
    for (i in 0 until m) {
        sss.add(sss[0])
        sss.removeAt(0)
    }
    for (i in sss.indices) {
        println(sss[i])
    }
}