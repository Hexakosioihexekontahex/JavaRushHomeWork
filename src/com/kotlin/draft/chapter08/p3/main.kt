package com.kotlin.draft.chapter08.p3

import com.kotlin.draft.chapter05.p1.Person

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 23), Person("Bob", 32))

    fun lookForAlice(people: List<Person>) {
        for (person in people) {
            if (person.name == "Alice") {
                println("Found!")
                return
            }
        }
        println("Alice is not found")
    }
    lookForAlice(people)

    fun lookForAliceForEach(people: List<Person>) {
        people.forEach {
            if (it.name == "Alice") {
                println("Found!")
                return
            }
        }
        println("Alice is not found")
    }
    lookForAliceForEach(people)

    fun lookForAliceLabel(people: List<Person>) {
//        people.forEach label@{
//            if (it.name == "Alice") return@label
//        }
        //or:
        people.forEach {
            if (it.name == "Alice") return@forEach
        }
        println("Alice might be somewhere")
    }
    lookForAliceLabel(people)

    println(StringBuilder().apply sb@{
        listOf(1, 2, 3).apply {
            this@sb.append(this.toString())
        }
    })

    fun lookForAliceAnon(people: List<Person>) {
        people.forEach(fun (person) {
            if (person.name == "Alice") return
            println("${person.name} is not Alice")
        })
    }
    lookForAliceAnon(people)

    println(people.filter(fun (person): Boolean {
        return person.age < 30
    }))
    println(people.filter(fun (person) = person.age < 30))
    
}
