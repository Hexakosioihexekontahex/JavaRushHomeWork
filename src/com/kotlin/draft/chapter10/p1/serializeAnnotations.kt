package com.kotlin.draft.chapter10.p1

import kotlin.reflect.KClass

/**
 *
 *      --- Для Gradle-проекта ---
 *
 *
data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val person = Person("Alice", 29)
    println(serialize(person))
[Output]:{"age": 29, "name": "Alice"}
    val json = """{"name": "Alice", "age": 29}"""
    println(deserialize<person>(json))
[Output]:Person(name=Alice, age=29)
}
        */
/**
data class Person(
        @JsonName("alias") val firstName: String, //ключ
        @JsonExclude val age: Int? = null //исключено из процесса сериализации/десериализации
)
*/

annotation class JsonName(val name: String)

/* Java */
//public @interface JsonName {
//      String value();
//}

//@JsonName("first_name") == @JsonName(name = "first_name")

@Target(AnnotationTarget.PROPERTY)
annotation class JsonExclude

@Target(AnnotationTarget.ANNOTATION_CLASS)
annotation class BindingAnnotation

@BindingAnnotation
annotation class MyBinding

//---------------------------------------------------------------------
interface Company {
    val name: String
}

data class CompanyImpl(override val name: String) : Company

data class Person(
        val name: String,
        @DeserializeInterface(CompanyImpl::class) val company: Company
)

annotation class DeserializeInterface(val targetClass: KClass<out Any>)
//---------------------------------------------------------------------
/**
interface ValueSerializer<T> {
    fun toJsonValue(value: T): Any?
    fun fromJsonValue(jsonValue: Any?): T
}

data class Person(
        val name: String,
        @CustomSerializer(DataSerializer::class) val birthDate: Date
)

annotation class CustonSerializer(
        val serializerClass: KClass<out ValueSerializer<*>>
)
        */
