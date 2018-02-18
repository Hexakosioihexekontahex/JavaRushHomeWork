package com.kotlin.draft.chapter04.p4

object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary(){
        for (person in allEmployees) {
            /*...*/
        }
    }
}

data class Person(val fullName: String, var position: String) {
    object NameComparator : Comparator<Person> {
        override fun compare(p1: Person?, p2: Person?): Int =
                p1!!.fullName.compareTo(p2!!.fullName)

    }
}