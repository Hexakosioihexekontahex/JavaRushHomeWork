package com.kotlin.draft.chapter09.p3

import java.util.*

interface Function1<in P, out R> { // (P) -> R
    operator fun invoke(p: P): R
}
/**
fun enumerateCats(f: (Cat) -> Number) { ... }
fun Animal.getIndex(): Int = ...
>>> enumerateCats(Animal::getIndex)
     */

//fun <T> copyData(source: MutableList<T>, destination: MutableList<T>) {
//    for (item in source) {
//        destination.add(item)
//    }
//}

//fun <T : R, R> copyData(source: MutableList<T>, destination: MutableList<R>) {
//    for (item in source) {
//        destination.add(item)
//    }
//}

//fun <T> copyData(source: MutableList<out T>, destination: MutableList<T>) {
//    for (item in source) {
//        destination.add(item)
//    }
//}

//fun <T> copyData(source: List<T>, destination: MutableList<T>) {
////List declared as List<out T>, that's why 'out' is redundant
//    for (item in source) {
//        destination.add(item)
//    }
//}

fun <T> copyData(source: MutableList<T>,
                 destination: MutableList<in T>) {
    for (item in source) {
        destination.add(item)
    }
}

fun main(args: Array<String>) {
    val ints = mutableListOf(1, 2, 3)
    val anyItems = mutableListOf<Any>()
    copyData(ints, anyItems)
    println(anyItems)

    val anyTypeList: MutableList<Any?>
    val unknownTypeList: MutableList<*>

    val list: MutableList<Any?> = mutableListOf('a', 1, "qwe")
    val chars = mutableListOf('b', 'c', 'd')
    val unknownElements: MutableList<*> =
            if (Random().nextBoolean()) list else chars
    println(unknownElements.first())

    printFirst(listOf("Svetlana", "Dmitry"))
    printFirst(listOf(1, 2, 3))
}

//fun printFirst(list: List<*>) {
//    if (list.isNotEmpty()) {
//        println(list.first()) //first() return :Any?
//    }
//}

fun <T> printFirst(list: List<T>) {
    if (list.isNotEmpty()) {
        println(list.first()) //first() return :T
    }
}