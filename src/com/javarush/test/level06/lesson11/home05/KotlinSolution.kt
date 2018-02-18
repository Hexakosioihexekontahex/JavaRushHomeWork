package com.javarush.test.level06.lesson11.home05

object KotlinSolution {
    @JvmStatic
    fun main(args: Array<String>) {
        printIdea(Idea())
    }

    class Idea {
        val description = "Not empty string"
    }

    fun printIdea(idea: Idea) = println(idea.description)

}