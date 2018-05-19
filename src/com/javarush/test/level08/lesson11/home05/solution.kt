package com.javarush.test.level08.lesson11.home05

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val s = reader.readLine()

    val charArray = s.toCharArray() // стринг аррей в чар
    charArray[0] = Character.toUpperCase(charArray[0]) // символ в ячейке с индексом 0 получает метод заглавной буквы

    for (i in 0 until charArray.size - 1) {
        if (charArray[i] == ' ') {
            charArray[i + 1] = Character.toUpperCase(charArray[i + 1])
        }
    }
    println(charArray)
}