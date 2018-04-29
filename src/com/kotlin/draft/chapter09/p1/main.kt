package com.kotlin.draft.chapter09.p1

val readers1: MutableList<String> = mutableListOf()
val readers2 = mutableListOf<String>()

fun main(args: Array<String>) {
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2))
    println(letters.slice(10..13))

    val authors = listOf("Dmitry", "Svetlana")
    val readers = mutableListOf<String>(/*...*/)

    readers.filter { it !in authors }

    println(listOf(1, 2, 3, 4).penultimate)
    println(authors.penultimate)

    println(oneHalf(5))

    println(max("java", "kotlin"))

    val helloWorld = StringBuilder("Hello World")
    ensureTrailingPeriod(helloWorld)
    println(helloWorld)

    nullBound()
}

val <T> List<T>.penultimate: T
    get() = this[size - 2]

//fun <T: Number> List<T>.sum(): T

fun <T: Number> oneHalf(value: T): Double {
    return value.toDouble() / 2.0
}

fun <T: Comparable<T>> max(first: T, second: T): T {
    return if (first > second) first else second
}

fun <T> ensureTrailingPeriod(seq: T) where T: CharSequence, T: Appendable {
    if (!seq.endsWith('.')) seq.append('.')
}

class NullableProcess<T> {
    fun process(value: T) {
        value?.hashCode()
    }
}

class NotNullProcess<T: Any> {
    fun process(value: T) {
        value.hashCode()
    }
}

fun nullBound() {
    val nullableStringProcessor = NullableProcess<String?>()
    nullableStringProcessor.process(null)

    val notNullableStringProcess = NotNullProcess<String>()
    notNullableStringProcess.process("abc")
}
