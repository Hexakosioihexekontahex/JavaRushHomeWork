package com.kotlin.draft.chapter04.p2

fun main(args: Array<String>) {
    println(PrivateUser("test@kotlin.org").nickname)
    println(SubscribingUser("test@kotlin.org").nickname)

    val userr = Userr("Alice")
    userr.address = "Elsenheimerstrasse 47, 80687 Muenchen"

    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}