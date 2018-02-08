package com.javarush.test.level03.lesson06.task04

/* Экранирование символов

Вывести на экран следующий текст - две строки:

It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
*/

fun main(args: Array<String>) {
    println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"")
    println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"")
}