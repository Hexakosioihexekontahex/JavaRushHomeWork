package com.javarush.test.level01.lesson08.task05

fun main(args: Array<String>) {
    sum(2, 2)
    sum2(2, 2)
}

fun sum(a : Int, b : Int){
    val c = a + b
    println(c)
}

fun sum2(a : Int, b : Int){
    println("$a + $b = ${a + b}")
}