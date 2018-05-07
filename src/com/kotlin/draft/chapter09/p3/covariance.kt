package com.kotlin.draft.chapter09.p3

/**
        Producer<A> <= Producer<B>
        if
        A <= B
        */

interface Producer<out T> {
    fun produce(): T
}

/**

    open class Animal {
        fun feed() { ... }
    }

    class Herd<out T: Animal> {
        val size: Int get() = ...
        operator fun get(i: Int): T { ... }
    }

    fun feedAll(animals: Herd<Animal>) {
        for (i in 0 until animals.size) {
            animals[i].feed()
        }
    }

    class Cat : Animal() {
        fun cleanLitter() { ... }
    }

    fun takeCareOfCats(cats: Herd<Cat>) {
        for (i in 0 until cats.size) {
            cats[i].cleanLitter()
            feedAll(cats)
        }
    }

    //ковариантный интерфейс:
    interface List<out T> : Collection<T> {
        operator fun get(index: Int): T
        // ...
        fun subList(fromIndex: Int, toIndex: Int): List<T>
        // ...
    }

    //интерфейс не получится объявить ковариантным,
    // т.к. тип Т присутствует и в исходящих, и во входящих позициях:
    interface MutableList<T> : List<T>, MutableCollection<T> {
        // ...
        override fun add(element: T): Boolean //входящая позиция типа Т
        // ...
    }

    //использование исходящего типа как параметр конструктора:
    сlass Herd<out T: Animal>(vararg animals: T) { ... }

    //класс содержит метод для записи свойства, т.е. использует тип Т во входящей позиции
    сlass Herd<T: Animal>(var leadAnimal: T, vararg animals: T) { ... }

    //правила вариантности не применяются к внутренней реаизации класса:
    class Herd<out T: Animal>(private va leadAnimal: T, vararg animals: T) { ... }

 */
