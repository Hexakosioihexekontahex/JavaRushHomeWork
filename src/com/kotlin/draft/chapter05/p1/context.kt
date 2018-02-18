package com.kotlin.draft.chapter05.p1

fun printMassagesWithPrefix(messages: Collection<String>, prefix: String){
    messages.forEach {
        println("$prefix $it")
    }
}

fun main(args: Array<String>) {
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMassagesWithPrefix(errors, "Error:")

    val responses = listOf("200 OK", "418 I'm a teapot",
            "500 Internal Server Error")
    println(responses)
    printProblemCount(responses)
}

fun printProblemCount(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")){
            clientErrors++
        } else if (it.startsWith("5")){
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

var counter = 0
val inc = { counter++ }

