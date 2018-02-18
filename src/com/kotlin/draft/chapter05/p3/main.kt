package com.kotlin.draft.chapter05.p3

import com.kotlin.draft.chapter05.p1.Person
import java.io.File

fun peopleToMapToFilter(people: Collection<Person>) =
        people.map(Person::name).filter { it.startsWith("A")}

fun peopleToMapToFilterAsSequence(people: Collection<Person>) =
        people.asSequence() //преобразует исходную коллекцию в последовательность
                .map(Person::name)                  //последовательность реализует
                .filter { it.startsWith("A") }//тот же API, что и коллекции
                .toList()//Преобразование получившейся последовательности обратно в список

/**
 * sequence.map { ... }.filter { ... }.toList()
 * промежуточные операции              завершающая
 *
* */

fun main(args: Array<String>) {
    println(listOf(1, 2, 3, 4).asSequence() //выполнятся преобразования только приведшие к 4
            .map { it * it }.find { it > 3 })

    val people = listOf(Person("Alice", 29), Person("Bob", 31),
            Person("Charles", 31), Person("Dan", 21))
    println(people.asSequence().map(Person::name).filter { it.length < 4 }.toList())/*
    сначала выделяются поля с именем, потом фильтр */
    println(people.asSequence().filter { it.name.length < 4 }.map(Person::name).toList())/*
    сначала фильтр, потом выделение полей, то есть меньше преобразований,
    а значит, быстрее выполнится*/

    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum()) //все отложенные операции выполнятся при обращении к "sum"
}

fun File.isInsideHiddenDirectory() =
        generateSequence(this) { it.parentFile }.any { it.isHidden }