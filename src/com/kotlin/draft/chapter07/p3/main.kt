package com.kotlin.draft.chapter07.p3

import com.kotlin.draft.chapter07.p1.Point
import java.time.LocalDate

operator fun Point.get(index: Int): Int {
    return when (index) {
        0 -> x
        1 -> y
        else -> {
            throw IndexOutOfBoundsException("Invalid coordinate $index")
        }
    }
}

fun main(args: Array<String>){
    val p = Point(10, 20)
    println(p[0])

    val p1 = MutablePoint(10, 20)
    p1[1] = 30
    println(p1)

    val rect = Rectangle(Point(10, 20), Point(50, 50))
    println(Point(20, 30) in rect)
    println(Point(5, 5) in rect)

    //operator fun <T: Comparable<T>> T.rangeTo(that: T): ClosedRange<T>
    val now = LocalDate.now()
    val vacation = now..now.plusDays(10)
    println("now.plusWeeks(1) in vacation: ${now.plusWeeks(1) in vacation}")

    val n = 9
    println(0..(n + 1))
    (0..n).forEach { print(it) }
    print("\n")

//operator fun CharSequence.iterator(): CharIterator
    for(c in "abc"){
        print(c)
    }
    print("\n")

    val newYear = LocalDate.ofYearDay(2018, 1)
    val daysOff = newYear.minusDays(1)..newYear
    for (dayOff in daysOff) { println(dayOff) }
}

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
        object : Iterator<LocalDate> {
            var current = start

            override fun hasNext() = current <= endInclusive

            override fun next() = current.apply {
                current = plusDays(1)
            }
        }
