package com.javarush.test.level01.lesson04.task02

fun main(args: Array<String>){
    val s = "JavaRush. Learn once - use anywhere"
    printTenTimes(s)
}

fun printTenTimes(s: String){
    for(i in 1..10){
        println(s)
    }
}