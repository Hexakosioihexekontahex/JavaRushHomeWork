package com.kotlin.draft.chapter04.p1.internalAndNestedClasses

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}