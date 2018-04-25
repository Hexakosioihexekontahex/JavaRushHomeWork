package com.kotlin.draft.chapter07.p1

import java.math.BigDecimal

fun main(args: Array<String>) {
    /**
     * Бинарные арифметические операторы, доступные для перегрузки:
     *
     * a * b    times
     * a / b    div
     * a % b    mod
     * a + b    plus
     * a - b    minus
     *
     */

    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
    println(p1 - p2)

    val p = Point(10, 20)
    println(p * 1.5)
    println(1.5 * p)

    println('a' * 3)

    /**
     * Функции поразрядных операций:
     *
     * shl      сдвиг влево со знаком
     * shr      сдвиг вправо со знаком
     * ushr     сдвиг вправо без знака
     * and      поразрядное "И"
     * or       поразрядное "ИЛИ"
     * xor      поразрядное "ИСКЛЮЧАЮЩЕЕ ИЛИ"
     * inv      поразрядная инверсия
     */

    println(0x0F and 0xF0)
    println(0x0F or 0xF0)
    println(0x1 shl 4)

    val numbers = ArrayList<Int>()
    numbers += 42
    println(numbers[0])

    val list = arrayListOf(1, 2)
    list +=3
    val newList = list + listOf(4, 5)
    println(list)
    println(newList)


    /**
     * унарные арифметические операторы, доступные для перезагрузки:
     *
     * +a           unaryPlus
     * -a           unaryMinus
     * !a           not
     * ++a, a++     inc
     * --a, a--     dec
     */

    val p3 = Point(10, 20)
    println(-p3)

    var bd = BigDecimal.ZERO
    println(bd++)//0
                 //1
    println(++bd)//2
}

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

operator fun Point.minus(other: Point): Point {
    return Point(x - other.x, y - other.y)
}

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Double.times(p: Point): Point {
    return Point((p.x * this).toInt(), (p.y * this).toInt())
}

operator fun Char.times(count: Int):String {
    return toString().repeat(count)
}

operator fun <T> MutableCollection<T>.plusAssign(element: T) {
    this.add(element)
}

operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE