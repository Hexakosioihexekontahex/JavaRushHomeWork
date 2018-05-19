package com.kotlin.draft.chapter11.p2

import kotlinx.html.*
import kotlinx.html.stream.createHTML

//fun buildString(
//        builderAction: (StringBuilder) -> Unit
//): String {
//    val sb = StringBuilder()
//    builderAction(sb)
//    return sb.toString()
//}

//fun buildString(
//        builderAction: StringBuilder.() -> Unit
//): String {
//    val sb = StringBuilder()
//    sb.builderAction()
//    return sb.toString()
//}

val appendExcl : StringBuilder.() -> Unit =
        { this.append("!") }

fun buildString(builderAction: StringBuilder.() -> Unit): String =
    StringBuilder().apply(builderAction).toString()

inline fun <T> T.apply(block: T.() -> Unit): T {
    block()
    return this
}

inline fun <T, R> with(receiver: T, block: T.() -> R): R =
        receiver.block()

fun main(args: Array<String>) {
    val s = buildString {
        /*this.*/append("Hello, ")
        append("World!")
    }
    println(s)

    val stringBuilder = StringBuilder("Hi")
    stringBuilder.appendExcl()
    println(stringBuilder)
    println(buildString(appendExcl))

    val map = mutableMapOf(1 to "one")
    map.apply { this[2] = "two" }
    with (map) { this[3] = "three" }
    println(map)
}

fun createSimpleTable() = createHTML().
        table {
            tr {
                td { +"cell"}
            }
        }
