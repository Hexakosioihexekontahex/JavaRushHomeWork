package com.kotlin.draft.chapter06.p3.javaInterfaceImplementation

import com.kotlin.draft.chapter01.Person

class PersonParser : DataParser<Person> {
    override fun parseData(input: String,
                           output: MutableList<Person>,
                           errors: MutableList<String?>) {
        // ...
    }
}