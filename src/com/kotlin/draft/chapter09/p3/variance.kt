package com.kotlin.draft.chapter09.p3

fun main(args: Array<String>) {
    printContents(listOf("abc", "def"))

    val strings = mutableListOf("abc", "def")
//    addAnswer(strings) /*Error:(7, 15) Kotlin: Type mismatch: inferred
// type is MutableList<String> but MutableList<Any> was expected*/
    println(strings.maxBy { it.length })

    val s = "abc"
    val chsq: CharSequence = s

    var i: Int? = 2
    var y: Int = 3
//    i = y//компилируемо
//    y = i//некомпилируемо

    val s1: String = "abc"
    val t: String? = s1

}

fun printContents(list: List<Any>) {
    println(list.joinToString())
}

fun addAnswer(list: MutableList<Any>) {
    list.add(42)
}

fun test(i: Int) {
    val n: Number = i //скомпилируется, т.к. Int является подтипом Number

//    fun f(s: String) { /*...*/ }
//    f(i) // не скомпилируется, т.к. Int не является подтипом String
}
