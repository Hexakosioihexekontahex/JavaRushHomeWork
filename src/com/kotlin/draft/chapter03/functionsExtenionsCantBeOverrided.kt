package com.kotlin.draft.chapter03

open class View {
    open fun click() = println("View clicked") //функция-член
}

class Button: View() {
    override fun click() = println("Button clicked") //функция-член
}

fun View.showOff() = println("I'm a view!") //функция-расширение
fun Button.showOff() = println("I'm a button!") //функция-расширение

fun main(args: Array<String>) {
    val view: View = Button()
    println("val view: View = Button()")

    print("view.click(): ")
    view.click()

    print("view.showOff(): ")
    view.showOff()
}