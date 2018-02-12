package com.kotlin.draft.chapter02

fun main(args: Array<String>) {
    println("Hello, ${if (args.isNotEmpty()) args[0] else "World"}!")
}