package com.javarush.test.level03.lesson12.home02

/* Я не хочу изучать Java, я хочу большую зарплату
Вывести на экран десять раз надпись «Я не хочу изучать Java, я хочу большую зарплату»
*/

fun main(args: Array<String>) {
    println10Times("Я хочу изучать Java, я хочу изучать Kotlin, я хочу большую зарплату")
}

fun println10Times(s: String){
    for(i in 1..10){
        println(s)
    }
}