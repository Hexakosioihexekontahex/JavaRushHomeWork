package com.kotlin.draft.chapter09.p2

import com.sun.deploy.services.Service
import java.util.*

fun main(args: Array<String>) {

    val list1: List<String> = listOf("a", "b")
    val list2: List<Int> = listOf(1, 2, 3)

    println("list1 is List<String> : ${list1 is List<String>}")
    println("list2 is List<Int> : ${list2 is List<Int>}")
    println("list1 and list2 is List<*> : ${list1 is List<*> && list2 is List<*> }")

    printSumAs(listOf(1, 2, 3))
    try {
        printSumAs(setOf(1, 2, 3))
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
    try {
        printSumAs(listOf("a", "b", "c"))
    } catch (e: ClassCastException) {
        println(e.message)
    }

    printSumIs(listOf(1, 2, 3))     //6
    printSumIs(setOf(1, 2, 3))      //
//    printSumIs(listOf("a", "b", "c")) //не скомпилируется

    println(isA<String>("abc"))     //true
    println(isA<String>(123))       //false

    val items = listOf("one", 2, "three")
    println(items.filterIsInstance<String>())
    println(items.filterIsInstance<Int>())
}

//fun isListStrings(list: List<*>): Boolean {
//    if (list is List<String>){ // Cannot check for instance of erased type
//        return true
//    } else false
//}

fun printSumAs(c: Collection<*>) {
    val intList = c as? List<Int>
    ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}

fun printSumIs(c: Collection<Int>) {
    if (c is List<Int>) {
        println(c.sum())
    }
}

//fun <T> isA(value: Any) = value is T // Cannot check for instance of erased type: T
inline fun <reified T> isA(value: Any) = value is T

//filterIsInstance realisation in standard Kotlin library:
/**
inline fun <reified T>
        Iterable<*>.filterIsInstance(): List<T> {
    val destination = mutableListOf<T>()
    for (element in this) {
        if (element is T) {
            destination.add(element)
        }
    }
    return destination
}
        */

val serviceImpl = loadService<Service>()

inline fun <reified T> loadService(): ServiceLoader<T>? {
    return ServiceLoader.load(T::class.java)
}
/**
inline fun <reified T: Activity> Context.startActivity() {
    val intent = Intent(this, T::class.java)
    startActivity(intent)
}
startActivity<DetailActivity>()
        */