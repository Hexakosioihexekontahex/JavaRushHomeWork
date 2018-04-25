package com.kotlin.draft.chapter06.p3.arrays

import com.kotlin.draft.chapter01.Person

fun main(args: Array<String>){
    for(i in args.indices){
        println("Argument $i is: ${args[i]}")
    }

    /* способы создания массивов: */
    //1
    arrayOf(1, 2, 3)
    arrayOf(Person("Jone", 21), Person("James", 34))
    arrayOf("asd", "qwe", "zxc")// в соответствии аргументам функции
    //2
    arrayOfNulls<String>(5)
    //3
    Array/*<Int>*/(10) { i -> i+i }

    val letters = Array/*<String>*/(26) { i -> ('a' +i).toString()}
    println(letters.joinToString(""))

    val strings = listOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray()))

    /* способы создания массивов примитивного типа: */
    //1
    IntArray(5)
    CharArray(10)
    ByteArray(3)

    //2
    intArrayOf(3, 5, 7, 11, 13, 17 )
    charArrayOf('j', 'a', 'v', 'a')

    //3
    IntArray(10) { i -> i+2}

    //4
    val list = listOf(0, 3, 5)
    val array = list.toIntArray()

    val fiveZeros = IntArray(5)
    val fiveZerosToo = intArrayOf(0, 0, 0, 0, 0)
    println(fiveZeros.contentEquals(fiveZerosToo))

    val squares = IntArray(5) { i -> (i+1)*(i+1)}
    println(squares.joinToString())

    args.forEachIndexed {index, element ->
        println("Argument $index is: $element")
    }
}

