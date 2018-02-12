package com.kotlin.draft.chapter02

fun main(args: Array<String>) {
    println(max(1, 2))
}

fun max(a: Int, b: Int) = if (a > b) a else b