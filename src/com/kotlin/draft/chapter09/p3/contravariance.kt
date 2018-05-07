package com.kotlin.draft.chapter09.p3

//interface Comparator<in T> {
//    fun compare(e1: T, e2: T): Int { ... }
//}

val anyComparator = Comparator<Any> {
    e1, e2 -> e1.hashCode() - e2.hashCode()
}

fun main(args: Array<String>) {
    val strings: List<String> = listOf("abc", "cba", "bac", "acb", "bca", "cab")
    println(strings
            .sortedWith(anyComparator)
            .joinToString(separator = "<"))
}
/**
Consumer<A> => Consumer<B>
        A <= B
        */