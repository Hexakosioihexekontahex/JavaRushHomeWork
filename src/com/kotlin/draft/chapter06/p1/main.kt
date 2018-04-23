package com.kotlin.draft.chapter06.p1

/**
        Java

int strLen(String s){
    return s.length();
}

*/

fun strLen(s: String) = s.length

fun strLenSafe(s: String?) : Int =
//        if(s != null) s.length else 0
        s?.length ?: 0

fun main(args: Array<String>) {
    val x: String? = null
    println(strLenSafe(x))

    val ceo = Employee("Da Boss", null)
    val developer = Employee("Mr.Smith", ceo)
    println(managerName(developer))
    println(managerName(ceo))

    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person = Person("Dmitry", jetbrains)
//    printShippingLabel(Person("Alexey", null))
// Exception in thread "main" java.lang.IllegalArgumentException: No address
    printShippingLabel(person)

    val p1 = Persn("Dmitry", "Jemerov")
    val p2 = Persn("Dmitry", "Jemerov")
//    println(p1.equals(p2))
    println(p1 == p2)
    println(p1.equals(42))

//    ignoreNulls(null)
}

class Persn(val firstName: String, val lastName: String){
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? Persn ?: return false

        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode(): Int = firstName.hashCode() * 37 + lastName.hashCode()
}

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!! //утверждение что не налл, здесь налл и кидает KotlinNullPointerException
    println(sNotNull.length)
}