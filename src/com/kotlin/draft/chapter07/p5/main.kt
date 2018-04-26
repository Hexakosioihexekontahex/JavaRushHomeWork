package com.kotlin.draft.chapter07.p5

import java.beans.PropertyChangeListener

//class Foo {
//    private val delegate = Delegate()
//
//    var p: Type
//        set(value: Type) = delegate.setValue(..., value)
//        get() = delegate.getValue(...)
//}

//class Foo {
//    var p: Type by Delegate()
//}

//class Delegate {
//    operator fun getValue(...) { ... }
//
//    operator fun setValue(..., value: Type) { ... }
//}

//fun main(args: Array<String>) {
//    val foo = Foo()
//    val oldValue = foo.p
//    foo.p = newValue
//}

class Email { /*...*/ }

fun loadEmails(person: Person): List<Email> {
    println("Load emails for ${person.name}")
    return listOf(/*...*/)
}

//class Person(val name: String) {
//    private var _emails: List<Email>? = null
//
//    val emails: List<Email> get() {
//        if(_emails == null){
//            _emails = loadEmails(this)
//        }
//        return _emails!!
//    }
//}

fun main(args: Array<String>){
    val p = Person("Alice", 22, 1000)
    p.emails
    p.emails

    val p1 = Person("Dmitry", 34, 2000)
    p1.addPropertyChangeListener(
            PropertyChangeListener { event ->
                println("Property ${event.propertyName} changed " +
                "from ${event.oldValue} to ${event.newValue}")
            }
    )
    p1.age = 35
    p1.salary = 2100
}
