@file:JvmName("StringFunctions")

package com.kotlin.draft.chapter03.strings

//@JvmOverloads
//fun <T> joinToString(
//        collection : Collection<T>,
//        separator : String = ", ",
//        prefix: String = "",
//        postfix: String = ""
//): String {
//    val result = StringBuilder(prefix)
//
//    for((index, element) in collection.withIndex()){
//        if(index > 0) result.append(separator)
//        result.append(element)
//    }
//
//    result.append(postfix)
//    return result.toString()
//}

@JvmOverloads
fun <T> Collection<T>.joinToString(
        separator : String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for((index, element) in this.withIndex()){
        if(index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    performOperation()
    return result.toString()
}

@JvmOverloads
fun Collection<String>.join(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
) = joinToString(separator, prefix, postfix)

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

//fun String.lastChar(): Char = get(length-1) //см.строку 74
//String (здесь) - receiver type (тип-получатель),
// а this - receiver object (объект-получатель)

val String.lastChar: Char //функцию-расширение преобразовали в свойство-расширение
    get() = get(length-1)

var StringBuilder.lastCharSb: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }