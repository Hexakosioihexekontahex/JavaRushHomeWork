package com.kotlin.draft.chapter07.p5

//object Users : IdTable() {
//    val name: Column<String> = varchar("name", length = 50).index()
//    val age: Column<Int> = integer("age")
//}
//
//class User(id: EntityID) : Entity(id) {
//    var name: String by Users.name
//    var age: Int by Users.age
//}
//
//operator fun <T> Column<T>.getValue(o: Entity, desc: KProperty<*>): T {
//    /* извлекает значение из бд */
//}
//
//operator fun <T> Column<T>.setValue(o: Entity, desc: KProperty<*>, value: T) {
//    /* изменяет значение в бд */
//}

// see https://github.com/JetBrains/Exposed