package com.javarush.test.level05.lesson12.home03

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

fun main(args: Array<String>) {
    val jerryMouse = Mouse("Jerry", 12, 5)
    val catTom = Cat("Tom", 30, 10)
    val dogFox = Dog("Fox", 50, 20)
}

data class Mouse(var name: String, var height: Int, var tail: Int)
data class Dog(var name: String, var height: Int, var tail: Int)
data class Cat(var name: String, var height: Int, var tail: Int)