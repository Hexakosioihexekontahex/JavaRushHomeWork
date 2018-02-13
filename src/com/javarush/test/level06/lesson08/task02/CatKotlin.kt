package com.javarush.test.level06.lesson08.task02

class CatKotlin {
    init {
        catCount++
    }

    companion object {//TODO проверить идиоматику когда столкнусь с темой в книге
        var catCount = 0
    }
}