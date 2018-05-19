package com.javarush.test.level08.lesson11.home09

import java.util.*

fun main(args: Array<String>) {
}

fun isDateOdd(date: String): Boolean {
    val newYear = Date()
    newYear.month = 0
    newYear.date = 1

    val nowDate = Date(date)
    val timeDistance = nowDate.time - newYear.time
    val msDay = (24 * 60 * 60 * 1000).toLong()
    val dayCount = (timeDistance / msDay).toInt()
    return if (dayCount % 2 != 0) {
        true
    } else {
        false
    }
}