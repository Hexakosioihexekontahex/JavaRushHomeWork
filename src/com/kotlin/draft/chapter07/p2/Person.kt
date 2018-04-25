package com.kotlin.draft.chapter07.p2

class Person(
        val firstName: String, val lastName: String
) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other,
                Person::lastName, Person::firstName)
    }
}