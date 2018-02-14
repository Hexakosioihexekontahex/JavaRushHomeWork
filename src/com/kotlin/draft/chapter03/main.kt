package com.kotlin.draft.chapter03

import com.kotlin.draft.chapter03.strings.*
import com.kotlin.draft.chapter03.strings.lastChar as last

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(list.joinToString(";", "(", ")"))
    println(list.joinToString(" "))
    println(list.joinToString(postfix = ";", prefix = "# "))

    println("Kotlin".last())
    println(listOf("One", "Two", "Three").join(" "))

    reportOperationCount()

    println("Kotlin".last)
    val sb = StringBuilder("Kotlin?")
    sb.lastCharSb = '!'
    println(sb)
}