package com.javarush.test.level07.lesson12.bonus01

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.ArrayList

val CATS = ArrayList<Cat>()

@Throws(IOException::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val name = reader.readLine()
        if (name.isEmpty()) break
        val age = Integer.parseInt(reader.readLine())
        val weight = Integer.parseInt(reader.readLine())
        val tailLength = Integer.parseInt(reader.readLine())

        if (name.isEmpty()) break

        val cat = Cat(name, age, weight, tailLength)
        CATS.add(cat)
    }

    printList()
}

fun printList() {
    for (i in CATS.indices) {
        println(CATS[i])
    }
}

class Cat internal constructor(private val name: String, private val age: Int,
                               private val weight: Int, private val tailLength: Int) {

    override fun toString(): String {
        return "Cat name is $name, age is $age, weight is $weight, tail = $tailLength"
    }
}