package com.javarush.test.level05.lesson12.home01

/* Три класса
По аналогии с классом Duck(утка) создай классы Cat(кошка) и Dog(собака).
Подумай, что должен возвращать метод toString в классах Cat и Dog?
В методе main создай по два объекта каждого класса и выведи их на экран.
Объекты класса Duck уже созданы и выводятся на экран.
*/

fun main(args: Array<String>) {
    val duck1 = Duck()
    val duck2 = Duck()
    println(duck1)
    println(duck2)

    val cat1 = Cat()
    val cat2 = Cat()
    println(cat1)
    println(cat2)

    val dog1 = Dog()
    val dog2 = Dog()
    println(dog1)
    println(dog2)
}

class Duck {
    override fun toString(): String {
        return "Duck"
    }
}

class Cat {
    override fun toString(): String {
        return "Cat"
    }
}

class Dog {
    override fun toString(): String {
        return "Dog"
    }
}