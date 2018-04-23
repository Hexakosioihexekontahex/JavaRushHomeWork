package com.kotlin.draft.chapter06.p1

fun sendEmailTo(email: String){
    println("Sending email to $email")
}

fun main(args: Array<String>) {
    val email: String? = null
    email?.let { sendEmailTo(it) }

//    val person: Person? = getTheBestPersonInTheWorld()
//    if (person != null) sendEmailTo(person.email)
//                                 |
//                                 V
//    getTheBestPersonInTheWorld()?.let { sendEmailTo(it.email)}
}

