package com.javarush.test.level02.lesson08.task06


/* Вывод текста на экран
Написать функцию, которая выводит переданную строку (слово) на экран три раза, но в одной строке.
Слова должны быть разделены пробелом и не должны сливаться в одно.
*/

fun print3toString(s : String){
    println("$s $s $s")
}

fun main(args: Array<String>) {
    print3toString("window")
    print3toString("file")
}