@file:JvmName("StringFunctions")

package com.kotlin.draft.chapter03.strings

@JvmOverloads
fun <T>  joinToString(
        collection : Collection<T>,
        separator : String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for((index, element) in collection.withIndex()){
        if(index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(joinToString(list, ";", "(", ")"))
    println(joinToString(list))
    println(joinToString(list, postfix = ";", prefix = "# "))
}

/**
        св-ва верхнего уровня
 */

var opCount = 0

fun performOperation(){
    opCount++
    // ...
}

fun reportOperationCount(){
    println("Operation performed $opCount times")
}

const val UNIX_LINE_SEPARATOR = "\n"
// == public static final String UNIX_LINE_SEPARATOR = "\n";

/**
        функции-расширения
 */

fun String.lastChar(): Char = get(length-1)
//String (здесь) - receiver type (тип-получатель),
// а this - receiver object (объект-получатель)

