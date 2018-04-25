package com.kotlin.draft.chapter07.p3

import com.kotlin.draft.chapter07.p1.Point

data class Rectangle(val upperLeft: Point, val lowerRight: Point)

operator fun Rectangle.contains(p: Point): Boolean {
    return p.x in upperLeft.x until lowerRight.x &&
    return p.y in upperLeft.y until lowerRight.y
}