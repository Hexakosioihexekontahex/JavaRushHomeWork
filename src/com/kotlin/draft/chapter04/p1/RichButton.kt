package com.kotlin.draft.chapter04.p1

open class RichButton : Clickable {

    fun disable(){}

    open fun animate(){}

    final override fun click() {}
}