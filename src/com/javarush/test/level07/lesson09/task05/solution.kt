package com.javarush.test.level07.lesson09.task05

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayList

@Throws(Exception::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val list = ArrayList<String>()
    for (i in 0..9) {
        list.add(reader.readLine())
    }
    //Считать строки с консоли и объявить ArrayList list тут

    val result = doubleValues(list)

    for (i in result.indices) {
        println(result[i])//Вывести на экран result
    }
}

fun doubleValues(list: ArrayList<String>): ArrayList<String> {
    var i = 0
    while (i < list.size) {

        list.add(i + 1, list[i])
        i += 2
    }
    //напишите тут ваш код
    return list
}