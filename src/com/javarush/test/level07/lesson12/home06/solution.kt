package com.javarush.test.level07.lesson12.home06

fun main(args: Array<String>) {
    val gFather1 = Human("GrandFather1", true, 55, null, null)
    val gMother1 = Human("GrandMother1", false, 54, null, null)
    val gFather2 = Human("GrandFather2", true, 57, null, null)
    val gMother2 = Human("GrandMother2", false, 56, null, null)
    val father1 = Human("Father", true, 45, gFather1, gMother1)
    val mother1 = Human("Mother", false, 44, gFather2, gMother2)
    val kids1 = Human("Kid1", true, 24, father1, mother1)
    val kids2 = Human("Kid2", true, 24, father1, mother1)
    val kids3 = Human("Kid3", true, 24, father1, mother1)

    println(gFather1)
    println(gMother1)
    println(gFather2)
    println(gMother2)
    println(father1)
    println(mother1)
    println(kids1)
    println(kids2)
    println(kids3)
}

class Human internal constructor(private val name: String, private val sex: Boolean?,
                                 private val age: Int, private val father: Human?, private val mother: Human?) {


    override fun toString() = "Имя: $name, пол: ${if(sex == null) "неизвестен" else if (sex) "мужской" else "женский"}, возраст: $age${
        if (father != null) ", отец: ${father.name}" else ""
        }${
        if (mother != null) ", мать: ${mother.name}" else ""
        }"
}