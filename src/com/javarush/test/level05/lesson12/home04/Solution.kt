package com.javarush.test.level05.lesson12.home04

import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    val date = Date()
    val myFormat = SimpleDateFormat("dd MM yyy")
    println(myFormat.format(date))
}