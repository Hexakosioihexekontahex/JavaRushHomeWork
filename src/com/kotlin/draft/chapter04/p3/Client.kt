package com.kotlin.draft.chapter04.p3

data class Client(val name: String, val postalCode: Int){

    //данный код можно опустить, добавив модификатор data перед объявлением класса
    /**
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client){
            return false
        }
        return name == other.name &&
                postalCode == other.postalCode
    }

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode

    override fun toString(): String = "Client(name=$name, postalCode=$postalCode)"

    fun copy(name: String = this.name,
            postalCode: Int = this.postalCode) =
        Client(name, postalCode)
     */

}