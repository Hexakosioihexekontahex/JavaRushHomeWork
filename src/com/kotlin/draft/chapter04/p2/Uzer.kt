package com.kotlin.draft.chapter04.p2

interface Uzer {
//    val email: String // абстрактное св-во должно быть определено в реализующих интерфейс классах
    val nickname: String
//    get() = email.substringBefore('@') // не хранит состояния, но вычисляет при попытке доступа
}

class PrivateUser(override val nickname: String) : Uzer

class SubscribingUser(val email: String) : Uzer {
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : Uzer {
    override val nickname = getFacebookName(accountId)

    private fun getFacebookName(accountId: Int): String {
        /* предполагается нормальная реализация ф-ции */
        return "FacebookName"}
}

class Userr(val name: String) {
    var address: String = "unspecified"
    set(value: String) {
        println("""
            Address was changed for $name:
            "$field" -> "$value".""".trimIndent())
        field = value
    }
}