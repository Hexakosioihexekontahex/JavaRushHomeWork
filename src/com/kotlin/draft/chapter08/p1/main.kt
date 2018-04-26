package com.kotlin.draft.chapter08.p1

//val sum = { x: Int, y: Int -> x + y}
//val action = { println(42) }

val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
val action: () -> Unit = { println(42) }

//(Int, String) -> Unit

var funOrNull: ((Int, Int) -> Int?)? = null

fun performRequest(
        url: String,
        callback: (code: Int, content: String) -> Unit
) {
    /*...*/
}
val url = "http://kotl.in"

fun main(args: Array<String>) {
    performRequest(url) { code, content -> /*...*/ }
    performRequest(url) { code, page -> /*...*/ }

    twoAndThree { a, b -> a + b}
    twoAndThree { a, b -> a * b}
    twoAndThree { a, b -> a - b}

    println("ab1c".filter { it in 'a'..'z' })

    val letters = listOf("Alpha", "Beta")
    println(letters)
    println(letters.joinToString { it.toLowerCase() })
    println(letters.joinToString(separator = "! ", postfix = "! ",
            transform = { it.toUpperCase() } ))
}

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) sb.append(element)
    }
    return sb.toString()
}

fun processTheAnswer(f: (Int) -> Int) {
    println(f(42))
}

fun <T> Collection<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = "",
        transform: ((T) -> String)? = { it.toString() }
): String {
    val result = StringBuilder(prefix)

    for((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        val str = transform?.invoke(element) ?: element.toString()
        result.append(str)
    }

    result.append(postfix)
    return result.toString()
}

fun foo(callback: (() -> Unit)?) {
    //...
    if (callback != null) {
        callback()
    }
}