package com.javarush.test.level06.lesson11.home01

fun main(args: Array<String>) {
    val cat1 = Cat()
    val cat2 = Cat()
    val cat3 = Cat()
    val cat4 = Cat()
    val cat5 = Cat()
    val cat6 = Cat()
    val cat7 = Cat()
    val cat8 = Cat()
    val cat9 = Cat()
    val cat10 = Cat()
    println(Cat.catCount)
}

class Cat internal constructor() {

    init {
        catCount++
    }

    companion object {
        var catCount: Int = 0
    }
}