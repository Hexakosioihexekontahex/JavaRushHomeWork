package com.kotlin.draft.chapter02

import java.util.Random

class Rectangle(val height: Int, val width: Int){
    val isSquare: Boolean get() = height == width
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(41, 41)
    println(rectangle.isSquare)

    val randomRectangle = createRandomRectangle()
    println("${randomRectangle.height} ${randomRectangle.width}")
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    var height = random.nextInt()
    var width = random.nextInt()

    if (height < 0) height *= -1
    if (width < 0) width *= -1

    return Rectangle(height, width)
}