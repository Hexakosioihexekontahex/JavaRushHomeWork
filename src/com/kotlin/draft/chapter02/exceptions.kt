package com.kotlin.draft.chapter02

import java.io.BufferedReader

fun checkPercentage(percentage: Int) {
    if (percentage !in 0..100){
        throw IllegalArgumentException(
                "A percentage value must be between 0 and 100: $percentage"
        )
    }
}

fun setPercentage(number: Int): Int {
    if (number in 0..100)
        return number
    else
        throw IllegalArgumentException(
                "A percentage value must be between 0 and 100: $number"
        )
}

fun readNumber(reader: BufferedReader): Int? {
    try{
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException){
        return null
    } finally{
        reader.close()
    }
}
