package com.javarush.test.level07.lesson12.home03

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.ArrayList

@Throws(IOException::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    var maximum: Int
    var minimum: Int

    val iii = ArrayList<Int>()
    for (i in 0..19) {
        iii.add(Integer.parseInt(reader.readLine()))
    }
    maximum = Integer.MIN_VALUE
    minimum = Integer.MAX_VALUE

    for (i in iii.indices) {
        if (iii[i] > maximum) {
            maximum = iii[i]
        }
        if (iii[i] < minimum) {
            minimum = iii[i]
        }
    }

    print("$maximum $minimum")
}