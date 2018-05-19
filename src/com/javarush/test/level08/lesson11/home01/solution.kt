package com.javarush.test.level08.lesson11.home01

import java.util.HashSet

fun main(args: Array<String>) {
    val cats = createCats()
    val i = cats.iterator()
    val cat = i.next()
    i.remove()
    printCats(cats)
}

fun createCats(): MutableSet<Cat> {
    val c = HashSet<Cat>()
    for (i in 0..2) {
        c.add(Cat())
    }
    return c
}

fun printCats(cats: Set<Cat>) {
    for (c in cats) {
        println(c)
    }
}

class Cat