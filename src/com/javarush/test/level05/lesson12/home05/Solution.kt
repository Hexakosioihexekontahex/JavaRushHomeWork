package com.javarush.test.level05.lesson12.home05

import java.io.BufferedReader
import java.io.InputStreamReader

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

@Throws (Exception::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    var sum = 0
    var x: String
    while (true) {
        x = reader.readLine()
        if (x == "сумма") break
        sum =+ Integer.parseInt(x)
    }
    reader.close()
    println(sum)
}