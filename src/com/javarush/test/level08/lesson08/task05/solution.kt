package com.javarush.test.level08.lesson08.task05

import java.util.HashMap

fun createMap(): HashMap<String, String> {
    val map = HashMap<String, String>()

    map.apply {
        this["Крячко"] = "Сергей"
        this["Шумейко"] = "Ольга"
        this["Ендовицкий"] = "Максим"
        this["Дякун"] = "Людмила" //!!!
        this["Дякун"] = "Александр"
        this["Дякун"] = "Ольга"
        this["Табаков"] = "Александр"
        this["Ярмантович"] = "Станислав"
        this["Скочеляс"] = "Ольга"
        this["Хомышин"] = "Антон"
    }
    return map
}

fun removeTheFirstNameDuplicates(map: HashMap<String, String>): HashMap<String, String> {
    val map2 = HashMap(map)
    val map3 = HashMap(map)

    for ((key, value) in map2) {
        map3.remove(key)
        if (map3.containsValue(value)) {
            removeItemFromMapByValue(map, value)
        }
    }
    return map
}

fun removeItemFromMapByValue(map: HashMap<String, String>, value: String) {
    val copy = HashMap(map)
    for ((key, value1) in copy) {
        if (value1 == value)
            map.remove(key)
    }
}

fun main(args: Array<String>) {
    val map = removeTheFirstNameDuplicates(createMap())
    map.forEach { println("${it.key} -> ${it.value}") }
}