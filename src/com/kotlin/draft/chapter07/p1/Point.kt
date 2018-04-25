package com.kotlin.draft.chapter07.p1

data class Point(val x: Int, val y: Int) {
//    {operator fun plus(other: Point): Point{
//        return Point(x + other.x, y + other.y)
//    }} вынесено за класс в функцию-расширение

    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Point) return false
        return other.x == x && other.y == y
    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        return result
    }
}
