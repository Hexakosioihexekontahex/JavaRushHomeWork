package com.kotlin.draft.chapter06.p2

fun showProgress(progress: Int){
    val percent = progress.coerceIn(0, 100)
    println("We're $percent% done!")
}

fun main(args: Array<String>){
    showProgress(146)

    println(Person("Sam", 35).isOlderThan(Person("Amy", 42)))
    println(Person("Sam", 35).isOlderThan(Person("Jane")))

    val listOfInts = listOf(1, 2, 3)

    val i = 1
    val l = i.toLong()
    val k = l.toInt()
    val b = k.toByte()
    println(Integer(42).equals(42L.toInt()))
    println(b.toLong() in listOf(1L, 2L, 3L))

    val longLiterals = listOf(123L, 321L, 2L, 34312L)
    val doubleLiterals = listOf(0.12, 2.0, 2e10, 1.2e-10)
    val floatLiterals = listOf(123.4f, .456F, 1e3f)
    val hexLiterals = listOf(0xCAFEBABE, 0XbcdL)
    val biLiterals = listOf(0b00000001, 0B101010011101)
    println(longLiterals)
    println(doubleLiterals)
    println(floatLiterals)
    println(hexLiterals)
    println(biLiterals)
    /*
    [123, 321, 2, 34312]
    [0.12, 2.0, 2.0E10, 1.2E-10]
    [123.4, 0.456, 1000.0]
    [3405691582, 3021]
    [1, 2717]
    */

    println("42".toInt())

}