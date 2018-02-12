package com.kotlin.draft.chapter02

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

val question =
        "The Ultimate Question of Life, The Universe, and Everything"
val answer = 42
val yearsToCompute = 7.5e6

@Throws(IOException::class)
fun main(args: Array<String>) {
    println(answerQuestion(BufferedReader(InputStreamReader(System.`in`)).readLine()))
}

fun answerQuestion(s: String): Int{
    return if (s == question){
        answer
    } else {
        yearsToCompute.toInt()
    }
}