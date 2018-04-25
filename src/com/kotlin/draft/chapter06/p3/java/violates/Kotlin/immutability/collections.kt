package com.kotlin.draft.chapter06.p3.java.violates.Kotlin.immutability

fun printInUppercase(list: List<String>){
    println(CollectionUtils.uppercaseAll(list))
    println(list.first())
}

fun main(args: Array<String>){
    val list = listOf("a", "b", "c")
    printInUppercase(list)
}