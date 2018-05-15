package com.kotlin.draft.chapter10.p2

import kotlin.reflect.KFunction2
import kotlin.reflect.full.memberProperties

class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val person = Person("Alice", 29)
    val kClass = person.javaClass.kotlin
    println(kClass.simpleName)
    kClass.memberProperties.forEach { println(it.name) }

    val kFunction = ::foo
    kFunction.call(42)
    try {
        kFunction.call()
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    val kFunction1: KFunction2<Int, Int, Int> = ::sum
    println(kFunction1.invoke(1, 2) + kFunction1(3, 4))

    val kProperty = ::counter
    kProperty.setter.call(42)
    println(kProperty.get())

    val memberProperty = Person::age
    println(memberProperty.get(person))

}

fun foo(x: Int) = println(x)

fun sum(x: Int, y: Int) = x + y

var counter = 0
