package com.javarush.test.level05.lesson07.task05

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

class RectangleKotlin{

    private var left = 0
    private var top = 0
    private var width = 0
    private var height = 0

    constructor(left: Int, top: Int, width: Int? = null, height: Int? = null){
        this.left = left
        this.top = top
        this.width = width ?: 0
        this.height = height ?: this.width
    }

    constructor(rectangle: RectangleKotlin) {
        this.top = rectangle.top
        this.left = rectangle.left
        this.width = rectangle.width
        this.height = rectangle.height
    }

    override fun toString(): String {
        return "$left $top $width $height"
    }

}

fun main(args: Array<String>) {
    val r1 = RectangleKotlin(4, 5, 6, 7)
    val r2 = RectangleKotlin(8, 9)
    val r3 = RectangleKotlin(10, 11, 12)
    val r4 = RectangleKotlin(r1)

    println(r1)
    println(r2)
    println(r3)
    println(r4)
}