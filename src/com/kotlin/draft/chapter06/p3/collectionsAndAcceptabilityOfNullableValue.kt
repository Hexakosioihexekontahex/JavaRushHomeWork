package com.kotlin.draft.chapter06.p3

import java.io.BufferedReader
import java.io.StringReader

fun readNumbers(reader: BufferedReader): List<Int?>{
    val result = ArrayList<Int?>()
    for (line in reader.lineSequence()){
//        try{
//            val number = line.toInt()
//            result.add(number)
//        }catch (e: NumberFormatException){
//            result.add(null)
//        }
        result.add(line.toIntOrNull()) //since Kotlin 1.1
    }
    return result
}

fun addValidNumbers(numbers: List<Int?>){
    var sumOfValidNumbers = 0
    var invalidNumbers = 0
    for(number in numbers){
        if(number != null){
            sumOfValidNumbers += number
        } else {
            invalidNumbers++
        }
    }
    println("Sum of valid numbers: $sumOfValidNumbers")
    println("Invalid numbers: $invalidNumbers")
}

fun main(args: Array<String>){
    val reader = BufferedReader(StringReader("1\nabc\n42"))
    val numbers = readNumbers(reader)
    addValidNumbers(numbers)
    println("-----------------")
    addValidNumbersFiltered(numbers)
}

fun addValidNumbersFiltered(numbers: List<Int?>){
    val validNumbers = numbers.filterNotNull()
    println("Sum of valid numbers: ${validNumbers.sum()}")
    println("Invalid numbers: ${numbers.size - validNumbers.size}")
}