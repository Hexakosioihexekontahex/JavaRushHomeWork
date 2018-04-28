package com.kotlin.draft.chapter08.p2

import java.io.BufferedReader
import java.io.FileReader

fun main(args: Array<String>) {
//    val l: Lock = ...
//    l.withLock {
//        // операция с ресурсом под защиой данной блокировки
//    }


}

//из стандартной библиотеки Kotlin:
/**
    fun <T> Lock.withLock(action: () -> T): T {
        lock()
        try {
            return action()
        } finally {
            unlock()
        }
    }
*/

fun readFirstLineFromFile(path: String): String {
    BufferedReader(FileReader(path)).use { br ->
        return br.readLine()
    }
}
