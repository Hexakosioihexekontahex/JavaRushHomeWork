package com.javarush.test.level06.lesson11.home04

var step: Int = 0

fun main(args: Array<String>?) {
    method1()
}

fun method1() {
    method2()
}


fun method2() {
    method3()
}

fun method3() {
    method4()
}

fun method4() {
    step++
    for (element in Thread.currentThread().stackTrace)
        println(element)
    if (step > 1) return
    main(null)
}