package com.javarush.test.level06.lesson11.home02

import java.util.ArrayList

class KotlinCat {
    companion object {
        var cats = ArrayList<KotlinCat>()

        @JvmStatic
        fun main(args: Array<String>) {
            for (i in 0..9) {
                val cat = KotlinCat()
                cats.add(cat)
            }
            printCats()
        }

        fun printCats() {
            for (i in cats.indices) {
                println(cats[i])
            }

        }
    }
}