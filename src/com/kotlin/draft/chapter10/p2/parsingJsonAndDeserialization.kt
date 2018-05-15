package com.kotlin.draft.chapter10.p2

import ru.yole.jkid.BooleanSerializer
import ru.yole.jkid.ByteSerializer
import ru.yole.jkid.IntSerializer
import ru.yole.jkid.ValueSerializer
import ru.yole.jkid.deserialization.*
import java.io.Reader
import java.lang.reflect.Type
import kotlin.reflect.KClass
import kotlin.reflect.KParameter
import kotlin.reflect.full.primaryConstructor
import kotlin.reflect.jvm.javaType

/**
    inline fun <reified T : Any> deserialize(json: String): T
        */

data class Author(val name: String)
data class Book(val title: String, val author: Author)

fun main(args: Array<String>) {
    val json = """{"title": "Catch-22", "author": {"name": "J. Heller"}}"""
    val book = deserialize<Book>(json)
    println(book)
}
/**
interface JsonObject {
    fun setSimpleProperty(propertyName: String, value: Any?)

    fun createObject(propertyName: String): JsonObject

    fun createArray(propertyName: String): JsonObject
}
        */

/**
package ru.yole.jkid.deserialization

public interface Seed : ru.yole.jkid.deserialization.JsonObject {
    public abstract val classInfoCache: ru.yole.jkid.deserialization.ClassInfoCache

    public open fun createArray(propertyName: kotlin.String):
        ru.yole.jkid.deserialization.JsonObject { /* compiled code */ }

    public abstract fun createCompositeProperty(
        propertyName: kotlin.String, isList: kotlin.Boolean):
            ru.yole.jkid.deserialization.JsonObject

    public open fun createObject(propertyName: kotlin.String):
        ru.yole.jkid.deserialization.JsonObject { /* compiled code */ }

    public abstract fun spawn(): kotlin.Any?
}
        */

/**
fun<T: Any> deserialize(json: Reader, targetClass: KClass<T>): T {
    val seed = ObjectSeed(targetClass, ClassInfoCache())
    Parser(json, seed).parse()
    return seed.spawn()
}
        */

/**
class ObjectSeed<out T: Any>(
        targetClass: KClass<T>,
        val classInfoCache: ClassInfoCache
) : Seed {

    private val classInfo: ClassInfo<T> =
            classInfoCache[targetClass]

    private val valueArguments = mutableMapOf<KParameter, Any?>()
    private val seedArguments = mutableMapOf<KParameter, Seed>()

    private val arguments: Map<KParameter, Any?>
            get() = valueArguments +
            seedArguments.mapValues { it.value.spawn() }

    override fun setSimpleProperty(propertyName: String, value: Any?) {
        val param = classInfo.getConstructorParameter(propertyName)
        valueArguments[param] =
                classInfo.deserializeConstructorArgument(param, value)
    }

    override fun createCompositeProperty(
            propertyName: String, isList: Boolean
    ): Seed {
        val param = classInfo.getConstructorParameter(propertyName)
        val deserializeAs =
                classInfo.getDeserializeClass(propertyName)
        val seed = createSeedForType(
                deserializeAs ?: param.type.javaType, isList)
        return seed.apply { seedArguments[param] = this }
    }

    override fun spawn(): T =
            classInfo.createInstance(arguments)
}

        */

/**
interface KCallable<out R> {
    fun callBy(args: Map<KParameter, Any?>): R
    ...
}
        */

/**
fun serializerForType(type: Type): ValueSerializer<out Any?>? =
        when(type) {
            Byte::class.java -> ByteSerializer
            Int::class.java -> IntSerializer
            Boolean::class.java -> BooleanSerializer
            // ...
            else -> null
        }

object BooleanSerializer : ValueSerializer<Boolean> {
    override fun fromJsonValue(jsonValue: Any?): Boolean {
        if (jsonValue !is Boolean) throw JKidException("Boolean expected")
        return jsonValue
    }
    override fun toJsonValue(value: Boolean) = value
}
        */

/**
class ClassInfoCache {
    private val cacheData = mutableMapOf<KClass<*>, ClassInfo<*>>()

    @Suppress("UNCHECHED_CAST")
    operator fun <T : Any> get(cls: KClass<T>): ClassInfo<T> =
            cacheData.getOrPut(cls) { ClassInfo(cls) } as ClassInfo<T>
}
        */

/**
class ClassInfo<T : Any>(cls: KClass<T>) {
    private val constructor = cls.primaryConstructor!!

    private val jsonNameToParamMap = hashMapOf<String, KParameter>()
    private val paramToSerializerMap =
            hashMapOf<KParameter, ValueSerializer<out Any?>>()
    private val jsonNameToDeserializeClassMap =
            hashMapOf<String, Class<out Any>?>()

    init {
        constructor.parameters.forEach { cacheDataForParameter(cls, it) }
    }

    fun getConstructorParameter(propertyName: String): KParameter =
            jsonNameToParam[propertyName]!!

    fun deserializeConstructorArgument(
            param: KParameter, value: Any?): Any? {
        val serializer = paramToSerializer[param]
        if (serializer != null) return serializer.fromJsonValue(value)

        validateArgumentType(param, value)
        return value
    }

    fun createInstance(arguments: Map<KParameter, Any?>): T {
        ensureAllParametersPresent(arguments)
        return constructor.callBy(arguments)
    }

    // ...
}
        */

/**
private fun ensureAllParametersPresent(arguments: Map<KParameter, Any?>) {
    for (param in constructor.parameters) {
        if (arguments[param] == null &&
                !param.isOptional && !param.type.isMarkedNullable) {
            throw JKidException("Missing value for parameter ${param.name}")
        }
    }
}
        */
