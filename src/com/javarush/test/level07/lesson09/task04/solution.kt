package com.javarush.test.level07.lesson09.task04

import java.util.ArrayList

@Throws(Exception::class)
fun main(args: Array<String>) {
    //создаем и заполняем список
    var list = ArrayList<String>()
    list.add("роза") //0
    list.add("лира") //1
    list.add("лоза") //2
    list = fix(list)

    //печатаем список
    for (s in list) {
        println(s)
    }
}

fun fix(list: ArrayList<String>): ArrayList<String> {
    //обрабатываем список
    var i = 0
    while (i < list.size) {
        if (list[i].contains("л") && list[i].contains("р")) {
        } else {
            if (list[i].contains("л")) {
                list.add(i, list[i])
                i++
            }
            if (list[i].contains("р")) {
                list.removeAt(i)
                i--
            }
        }
        i++
    }

    return list
}