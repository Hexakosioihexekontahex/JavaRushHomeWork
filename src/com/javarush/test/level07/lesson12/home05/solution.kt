package com.javarush.test.level07.lesson12.home05

@Throws(InterruptedException::class)
fun main(args: Array<String>) {
    for (i in 30 downTo 0) {
        println(i)

        Thread.sleep(100)
    }

    println("Бум!")
}