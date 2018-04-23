package com.kotlin.draft.chapter06.p1

fun yellAt(person: JavaPerson){
    println(person.name.toUpperCase() + "!!!")
}

fun yellAtSafe(person: JavaPerson){
    println((person.name ?: "Anyone").toUpperCase() + "!!!")
}

fun main(args: Array<String>) {
//    yellAt(JavaPerson(null))
    yellAtSafe(JavaPerson(null))

//    val i: Int = JavaPerson(null).name
//    Error:(15, 18) Kotlin: Type mismatch: inferred type is String! but Int was expected
    /** String! - платформенный тип, пришедший из Java */
}

class StringPrinter : StringProcessor {
    override fun process(value: String) {
        println(value)
    }
}

class NullableStringPrinter : StringProcessor {
    override fun process(value: String?) {
        if (value != null) {
            println(value)
        }
    }
}