package com.kotlin.draft.chapter07.p5

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class Person(
        val name: String, age: Int, salary: Int
) : PropertyChangeAware() {

    val emails by lazy { loadEmails(this) }

    private val observer = {
        prop: KProperty<*>, oldValue: Int, newValue: Int ->
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
    var age: Int by Delegates.observable(age, observer)
    var salary: Int by Delegates.observable(salary, observer)

}
