package com.kotlin.draft.chapter11.p4

import java.time.LocalDate
import java.time.Period

val yesterday = 1.days.ago
val tomorrow = 1.days.fromNow

val Int.days: Period
    get() = Period.ofDays(this)

val Period.ago: LocalDate
    get() = LocalDate.now() - this

val Period.fromNow: LocalDate
    get() = LocalDate.now() + this

fun main(args: Array<String>) {
    println("Yesterday was [$yesterday], tomorrow will be [$tomorrow]")
}
