package com.kotlin.draft.chapter08.p2


import com.kotlin.draft.chapter05.p1.Person
import sun.misc.Lock

inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}

fun main(args: Array<String>) {
    val l = Lock()
    synchronized(l) {
        //...
    }

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.filter { it.age < 30 })

    val result = mutableListOf<Person>()
    for (person in people) {
        if (person.age < 30) result.add(person)
    }
    println(result)

    println(people.filter { it.age > 30 }
            .map(Person::name))

    println(people.filter { it.age > 30 }
            .map(Person::name)
            .asSequence()) // для работы с большими коллекциями
}

fun foo(l: Lock) {
    println("Before sync")
    synchronized(l) {
        println("Action")
    }
    println("After sync")
}

class LockOwner(val lock: Lock) {
    fun runUnderLock(body: () -> Unit) {
        synchronized(lock, body)
    }
}

inline fun foo(inlined: () -> Unit, noinline notInlined: () -> Unit) {
    //...
}

