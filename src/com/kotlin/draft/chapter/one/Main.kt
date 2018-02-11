package com.kotlin.draft.chapter.one

fun main(args: Array<String>) {
    nullableString()
    againstClassCastException("make me uppercase")
}

fun nullableString(){
    val s1: String? = null //nullable
    val s2: String = "" //can't be NULL
}

fun againstClassCastException(value: String?){
    if (value is String) {
        println(value.toUpperCase())
    }
}