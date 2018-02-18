package com.kotlin.draft.chapter05.p1

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxBy { it.age }) // лямбда
    println(people.maxBy(Person::age)) // с использованием ссылки на член

    val sum = {x: Int, y: Int -> x + y}
    println(sum(4, 5))

    val printFortyTwo = { println(42) }
    run(printFortyTwo)
    run{ println(42) }

    people.maxBy({p: Person -> p.age})      //без синтаксических сокращений
    people.maxBy() { p: Person -> p.age }   //           v
    people.maxBy { p: Person -> p.age }     //           v
    people.maxBy { p -> p.age }             //           v
    people.maxBy { it.age }                 //совсем сокращенный вариант

    val names = people.joinToString(separator = " ", transform = { p: Person -> p.name })
    println(names)

    val names2 = people.joinToString(" "){ it.name }
    println(names2)

    val getAge = {p: Person -> p.age }
    people.maxBy(getAge)

    val sum2 = { x: Int, y: Int ->
        println("Computing the sum of $x and $y...")
        x + y
    }

    println(sum2(1, 2))
}