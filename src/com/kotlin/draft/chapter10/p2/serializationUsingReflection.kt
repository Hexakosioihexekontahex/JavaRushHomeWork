package com.kotlin.draft.chapter10.p2

import ru.yole.jkid.JsonExclude
import ru.yole.jkid.JsonName
import ru.yole.jkid.ValueSerializer
import ru.yole.jkid.joinToStringBuilder
import kotlin.reflect.KAnnotatedElement
import kotlin.reflect.KClass
import kotlin.reflect.KProperty
import kotlin.reflect.KProperty1
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.memberProperties

private fun StringBuilder.serializeObject(obj: Any) {
    /*
    val kClass = obj.javaClass.kotlin
    val properties = kClass.memberProperties
    properties.joinToStringBuilder(
            this, prefix = "{", postfix = "}"
    ) { prop ->
        serializeString(prop.name)
        append(": ")
        serializePropertyValue(prop.get(obj))
    }
    */
    obj.javaClass.kotlin.memberProperties
            .filter { it.findAnnotation<JsonExclude>() == null }
            .joinToStringBuilder(this, prefix = "{", postfix = "}") {
                serializeProperty(it, obj)
            }
}

private fun StringBuilder.serializeProperty(
        prop: KProperty1<Any, *>, obj: Any
) {
    val jsonNameAnn = prop.findAnnotation<JsonName>()?.name ?: prop.name

//    serializeString(name)
    append(": ")

    val value = prop.get(obj)
    val jsonValue =
            prop.getSerializer()?.toJsonValue(value)
    ?: value
//    serializePropertyValue(jsonValue)

}

inline fun <reified T> KAnnotatedElement.findAnnotation(): T?
        = annotations.filterIsInstance<T>().firstOrNull()

/**
        val properties = kClass.memberProperties
            .filter { it.findAnnotation<JsonExclude>() == null }

        annotation class JsonName(val name: String)

        data class Person(
            @JsonName("alias") val firstName: String,
            val age: Int
        )

        val jsonNameAnn = prop.findAnnotation<JsonName>()
        val propName = jsonNameAnn?.name ?: prop.name
     */

annotation class CustomSerializer(
        val serializerClass: KClass<out ValueSerializer<*>>
)

fun KProperty<*>.getSerializer(): ValueSerializer<Any?>? {
    val customSerializerAnn = findAnnotation<CustomSerializer>() ?: return null
    val serializerClass = customSerializerAnn.serializerClass

    val valueSerializer = serializerClass.objectInstance
            ?: serializerClass.createInstance()
    @Suppress("UNCHECKED_CAST")
    return valueSerializer as ValueSerializer<Any?>
}
