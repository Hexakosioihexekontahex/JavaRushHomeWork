package com.kotlin.draft.chapter07.p2

import com.kotlin.draft.chapter07.p1.Point

fun main(args: Array<String>) {
    println(Point(10, 20) == Point(10, 20))
    println(Point(10, 20) != Point(5, 5))
    println(null == Point(6, 8))

    val p1 = Person("Alice", "Smith")
    val p2 = Person("Bob", "Johnson")
    println(p1 < p2)

    println("abc" < "bac")
}