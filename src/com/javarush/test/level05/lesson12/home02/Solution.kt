package com.javarush.test.level05.lesson12.home02

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

fun main(args: Array<String>) {
    val man1 = Man("Вася", 19, "Алушта")
    val man2 = Man("Петя", 23, "Симферополь")
    val woman1 = Woman("Таня", 18, "Одесса")
    val woman2 = Woman("Маня", 19, "Киев")

    println(man1)
    println(man2)
    println(woman1)
    println(woman2)
}

data class Man(var name: String, var age: Int, var address: String){
    override fun toString(): String {
        return "[$name $age $address]"
    }
}

data class Woman(var name: String, var age: Int, var address: String){
    override fun toString(): String {
        return "[$name $age $address]"
    }
}