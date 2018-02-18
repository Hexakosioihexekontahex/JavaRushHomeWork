package com.kotlin.draft.chapter05.p1

//val getAge = { person: Person -> person.age }
val getAge = Person::age

fun salute() = println("Salute!")

fun main(args: Array<String>) {
    run(::salute) //ссылка на ф-цию верхнего уровня

    val p = createPerson("Alice", 29)

    println(p)

    val predicate = Person::isAdult

    val personsAgeFunction = Person::age
    val alicesAgeFunction = p::age
    println(personsAgeFunction(p))
    println(alicesAgeFunction())
}

val action = { person: Person, message: String ->
    sendEmail(person, message)
}
val nextAction = ::sendEmail //

fun sendEmail(person: Person, message: String){
    /*...*/
}

val createPerson = ::Person

fun Person.isAdult() = age >= 21