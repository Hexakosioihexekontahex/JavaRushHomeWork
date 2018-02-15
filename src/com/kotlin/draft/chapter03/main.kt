package com.kotlin.draft.chapter03

import com.kotlin.draft.chapter03.strings.*
import com.kotlin.draft.chapter03.strings.lastChar as last

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(list.joinToString(";", "(", ")"))
    println(list.joinToString(" "))
    println(list.joinToString(postfix = ";", prefix = "# "))

    println("Kotlin".last())//>>>n//(Kt lib)
    println(listOf("One", "Two", "Three").join(" "))//>>>One Two Three

    reportOperationCount()

    println("Kotlin".last)//>>>n
    val sb = StringBuilder("Kotlin?")
    sb.lastCharSb = '!'
    println(sb)//>>>Kotlin!

    val strings: List<String> = listOf("first", "second", "fourteenth")
    println(strings.last())//>>>fourteenth
    val numbers: Collection<Int> = setOf(1, 2, 14)
    println(numbers.max())//>>>14

    fun myArrayOf(vararg values: String) = arrayOf(*values) //модификатор vararg
    val myArgs = myArrayOf("abra", "kadabra")//>>>[strings: , abra, kadabra]
    val list2 = listOf("strings: ", *myArgs) // * - spread оператор
    println(list2)

    for((index, element) in numbers.withIndex()){
        println("numbers[$index]: $element")
    }
    val (number, string) = 7 to "seven" //Pair инициализирует сразу две переменные

    val map = mapOf(1.to("one"), //обычный вызов
            number to string,
            53 to "fifty-three") // инфиксный
    infix fun Int.multiply(number: Int) = this * number
    println(5 multiply 2)//>>>10


    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split(".", "-"))
    println("12.345-6.A".split('.', '-'))

    fun parsePath(path: String){
        val directory = path.substringBeforeLast("/")
        val fullName = path.substringAfterLast("/")

        val fileName = fullName.substringBeforeLast(".")
        val extension = fullName.substringAfterLast(".")

        println("Dir: $directory, name: $fileName, ext: $extension")
    }
    parsePath("com/kotlin/draft/chapter03/main.kt")
    fun parsePathReg(path: String){
        val regex = """(.+)/(.+)\.(.+)""".toRegex()
        val matchResult = regex.matchEntire(path)
        if (matchResult != null){
            val (directory, filename, extension) = matchResult.destructured
            println("Dir: $directory, name: $filename, ext: $extension")
        }
    }
    parsePath("com/kotlin/draft/chapter03/main.kt")

    val kotlinLogo = """| //
                       .|//
                       .|/ \"""
    println(kotlinLogo.trimMargin("."))
    println("""${'$'}99.9""")
}