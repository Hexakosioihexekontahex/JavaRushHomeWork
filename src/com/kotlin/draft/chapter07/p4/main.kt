package com.kotlin.draft.chapter07.p4

import com.kotlin.draft.chapter07.p1.Point

fun main(args: Array<String>) {
    val p = Point(10, 20)
    val (x, y) = p
    println(x)
    println(y)

    val(name, ext) = splitFilename("example.kt")
    println(name)
    println(ext)

    val map = mapOf("Oracle" to "Java", "JetBrains" to "Kotlin")
    printEntries(map)
}

//class Point(val x: Int, val y: Int) {
//    operator fun component1() = x     // для не дата классов
//    operator fun component2() = y
//}

fun printEntries(map: Map<String, String>) {
    for((key, value) in map){
        println("$key -> $value")
    }
}