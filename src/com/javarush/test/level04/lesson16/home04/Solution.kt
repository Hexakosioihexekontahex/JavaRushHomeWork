package com.javarush.test.level04.lesson16.home04

import java.io.BufferedReader
import java.io.InputStreamReader

@Throws(Exception::class)
fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val name = reader.readLine()
    val ys = reader.readLine()
    val ms = reader.readLine()
    val ds = reader.readLine()
    reader.close()
    val y = Integer.parseInt(ys)
    val m = Integer.parseInt(ms)
    val d = Integer.parseInt(ds)
    println("Меня зовут $name")
    print("Я родился $d.$m.$y")
}