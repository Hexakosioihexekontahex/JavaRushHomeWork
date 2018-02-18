package com.kotlin.draft.chapter05.p2

class Book(val title: String, val authors: List<String>)

fun findAllAuthors(books: Collection<Book>) = books.flatMap {it.authors}.toSet()

fun main(args: Array<String>) {
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })

    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")),
            Book("Mort", listOf("Terry Pratchett")),
            Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman")))
    println(findAllAuthors(books))
}