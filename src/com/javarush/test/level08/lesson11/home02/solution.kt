package com.javarush.test.level08.lesson11.home02

import java.util.HashSet

fun main(args: Array<String>) {
    val cats = createCats()
    val dogs = createDogs()

    val pets = join(cats, dogs)
    printPets(pets)

    removeCats(pets, cats)
    printPets(pets)
}

fun createCats(): Set<Cat> {
    val result = HashSet<Cat>()

    result += Cat()
    result += Cat()
    result += Cat()
    result += Cat()

    return result
}

fun createDogs(): Set<Dog> {
    val resultD = HashSet<Dog>()

    resultD += Dog()
    resultD += Dog()
    resultD += Dog()

    return resultD
}

fun join(cats: Set<Cat>, dogs: Set<Dog>): MutableSet<Any> {
    val pets = HashSet<Any>()

    pets.addAll(cats)
    pets.addAll(dogs)

    return pets
}

fun removeCats(pets: MutableSet<Any>, cats: Set<Cat>) {
    pets.removeAll(cats)
}

fun printPets(pets: Set<Any>) {
    for (pet in pets) {
        println(pet)
    }

    println()
}

class Cat

class Dog
