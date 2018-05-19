package com.javarush.test.level08.lesson11.home06

import java.util.ArrayList

fun main(args: Array<String>) {
    //init
    val son1 = Human("son Lesha", true, 15, ArrayList())
    val son2 = Human("son Misha", true, 10, ArrayList())
    val daughter = Human("daughter Masha", false, 5, ArrayList())
    val ch = ArrayList<Human>()
    ch.add(son1)
    ch.add(son2)
    ch.add(daughter)

    val pa = Human("papa Fedya", true, 40, ch)
    val ma = Human("mama Lena", false, 35, ch)
    val parents1 = ArrayList<Human>()
    val parents2 = ArrayList<Human>()
    parents2.add(pa)
    parents1.add(ma)

    val grPa1 = Human("ded Ivan", true, 70, parents1)
    val grMa1 = Human("baba Masha", false, 65, parents1)
    val grPa2 = Human("ded Ivan", true, 70, parents2)
    val grMa2 = Human("baba Masha", false, 65, parents2)
    //output
    println(grPa1.toString())
    println(grMa1.toString())
    println(grPa2.toString())
    println(grMa2.toString())
    println(pa.toString())
    println(ma.toString())
    println(son1.toString())
    println(son2.toString())
    println(daughter.toString())
}

class Human(internal var name: String, internal var sex: Boolean, internal var age: Int, internal var children: ArrayList<Human>) {

    override fun toString(): String {
        var text = ""
        text += "Имя: " + this.name
        text += ", пол: " + if (this.sex) "мужской" else "женский"
        text += ", возраст: " + this.age

        val childCount = this.children.size
        if (childCount > 0) {
            text += ", дети: " + this.children[0].name

            for (i in 1 until childCount) {
                val child = this.children[i]
                text += ", " + child.name
            }
        }

        return text
    }
}