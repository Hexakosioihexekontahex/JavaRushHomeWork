package com.kotlin.draft.chapter04.p4

class A {
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

fun main(args: Array<String>) {
    A.bar()

    val subscribingUser = User.newSubscribingUser("bob@gmail.com")
    val facebookUser = User.newFacebookUser(4)
    println(subscribingUser.nickname)
}

class User private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) =
                User(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) =
                User(getFacebookName(accountId))
    }

}
fun getFacebookName(accountId: Int) = "FacebookName" //нувыпонели

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class Persona(val name: String) {
    companion object : JSONFactory<Persona> {
        override fun fromJSON(jsonText: String): Persona {
            /* реализация интерфейса объектом-компаньоном */
            return Persona("")
        }
    }
}

//fun loadFromJSON<T>(factory: JSONFactory<T>): T {
//    /*...*/
//}
//
//loadFromJSON(Persona)