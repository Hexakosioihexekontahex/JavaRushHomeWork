package com.kotlin.draft.chapter04.p4

import java.io.File

fun main(args: Array<String>) {
    Payroll.allEmployees.add(Person(
            "Roman Melnik", "Kotlin Junior Developer"))
    Payroll.calculateSalary()

    println(CaseInsensitiveComparator.compare(
            File("/User"), File("/user")))

    val files = listOf(File("/Z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveComparator))

    val persons = listOf(Person("Bob", "auto-tester"),
            Person("Alice", "architect"))
    println(persons.sortedWith(Person.NameComparator))
}