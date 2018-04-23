package com.kotlin.draft.chapter06.p1

fun verifyUserInput(input: String?){
    if(input.isNullOrBlank()){
        println("Please fill in the required fields")
    }
}

fun main(args: Array<String>) {
    verifyUserInput(" ")
    verifyUserInput(null)

    printHashCode(null)
}

fun <T/*: Any?*/> printHashCode(t: T){
    println(t?.hashCode()) // разрешает null (Any?)
}

fun <T: Any> printHashCodeNotNull(t: T){ //null нельзя
    println(t.hashCode())
}