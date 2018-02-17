package com.kotlin.draft.chapter04.p3

fun main(args: Array<String>) {
    val client1 = Client("Alice", 342562)
    println(client1)

    val client2 = Client("Alice", 342562)
    println(client1==client2)

    val processed = hashSetOf(client1)
    println(processed.contains(Client("Alice", 342562)))

    val bob = Client("Bob", 973293)
    println(bob.copy(postalCode = 382555))

    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))
    println("${cset.objectsAdded} objects were added, ${cset.size} remain")
}