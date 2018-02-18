package com.kotlin.draft.chapter05.p2

import com.kotlin.draft.chapter05.p1.Person

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it%2 == 0 })

    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.filter { it.age > 30 })

    println(list.map { it * it })
    println(people.map { it.name })
    println(people.map(Person::name))
    println(people.filter { it.age > 30 }.map(Person::name))
    println(people.filter { it.age == people.maxBy(Person::age)!!.age })
    val maxAge = people.maxBy(Person::age)!!.age
    people.filter { it.age == maxAge }

    val numbers = mapOf(0 to "Zero", 1 to "One")
    println(numbers.mapValues { it.value.toUpperCase() })
    println(numbers.mapKeys { it.key + 1 })
    println(numbers.mapValues { it.value.toLowerCase() }.mapKeys { it.key - 1 })

    val canBeInClub27 = { p: Person -> p.age <= 27 }
    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))

    println(!list.all { it == 3})
    println(list.any { it != 3 })//лучше без отрицания ф-ции

    println(people.count(canBeInClub27))

    println(people.find(canBeInClub27))
    println(people.firstOrNull(canBeInClub27))

    val people1 = listOf(Person("Alice", 27), Person("Bob", 31),
            Person("Carol", 31))
    println(people1.groupBy { it.age }) // : Map<Int, List<Person>>

    val strings = listOf("aa", "ab", "bb")
    println(strings.groupBy(String::first))



}