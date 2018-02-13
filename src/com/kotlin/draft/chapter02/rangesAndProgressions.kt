package com.kotlin.draft.chapter02

import java.util.*

val oneToHundred = 1..100

fun fizzBuzz(i: Int) = when {
    i % 15  == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun main(args: Array<String>) {
    for(i in oneToHundred){
        print(fizzBuzz(i))
    }
    println()

    for(i in 100 downTo 1 step 2){
        print(fizzBuzz(i))
    }
    println()

    val list: ArrayList<String> = arrayListOf("Каждый", "Охотник", "Желает", "Знать", "Где", "Сидит", "Фазан")
    for (i in 0 until list.size){
        println(list[i])
    }
    for((index, element) in list.withIndex()){
        println("$index: $element")
    }

    val binaryReps = TreeMap<Char, String>()
    for(c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    for((letter, binary) in binaryReps){
        println("$letter = $binary")
    }

    fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
    fun isNotDigit(c: Char) = c !in '0'..'9'
    println(isLetter('q'))
    println(isNotDigit('x'))
    fun recognize(c: Char) = when (c){
        in '0'..'9' -> "It's a digit!"
        in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
        else -> "I don't know..."
    }
    println(recognize('8'))

    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))//множество не содержит строку "Kotlin"

}