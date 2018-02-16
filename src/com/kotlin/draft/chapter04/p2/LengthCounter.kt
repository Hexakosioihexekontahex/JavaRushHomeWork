package com.kotlin.draft.chapter04.p2

class LengthCounter {
    var counter: Int = 0 // public
    private set // значение этого свойства нельзя изменить вне класса

    fun addWord(word: String) {
        counter+= word.length
    }
}