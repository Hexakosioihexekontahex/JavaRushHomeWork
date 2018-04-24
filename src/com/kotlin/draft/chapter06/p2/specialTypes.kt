package com.kotlin.draft.chapter06.p2

import com.kotlin.draft.chapter06.p1.Company

val answer: Any = 42

var question: Any? = null

fun f(): Unit { /* Unit ~ void */ }

fun f1() { /* f() */ }


interface Processor<T>{
    fun process(): T
}

class NoResultProcessor : Processor<Unit> {
    override fun process() {
        // do sth
    }// no return, неявно добавляется компилятором
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun main(args: Array<String>) {
    val company = Company("NoAddress", null)
    val address = company.address ?: fail("No address")
    println(address.city)
}