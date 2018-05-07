package com.kotlin.draft.chapter09.p3

import kotlin.reflect.KClass

interface FieldValidator<in T> {
    fun validate(input: T): Boolean
}

object DefaultStringValidator : FieldValidator<String> {
    override fun validate(input: String): Boolean = input.isNotEmpty()
}

object DefaultIntValidator : FieldValidator<Int> {
    override fun validate(input: Int): Boolean = input >= 0
}

object Validators {
    private val validators =
            mutableMapOf<KClass<*>, FieldValidator<*>>()
    fun <T : Any> registerValidator(
            kClass: KClass<T>, fieldValidator: FieldValidator<T>) {
        validators[kClass] = fieldValidator
    }

    @Suppress("UNCHECKED_CAST")
operator fun <T: Any> get(kClass: KClass<T>): FieldValidator<T> =
            validators[kClass] as? FieldValidator<T>
    ?: throw IllegalArgumentException(
            "No validator for ${kClass.simpleName}")

}


fun main(args: Array<String>) {
//    val validators = mutableMapOf< KClass<*>, FieldValidator<*>>()
//    validators[String::class] = DefaultStringValidator
//    validators[Int::class] = DefaultIntValidator
//    validators[String::class]!!.validate("")
//    val stringValidator = validators[Int::class]
//            as FieldValidator<String>
//    stringValidator.validate("")
    Validators.registerValidator(String::class, DefaultStringValidator)
    Validators.registerValidator(Int::class, DefaultIntValidator)
    println(Validators[String::class].validate("Kotlin"))
    println(Validators[Int::class].validate(321))

//    println(Validators[String::class].validate(42))
// Error:(48, 52) Kotlin: The integer literal does not conform
// to the expected type String

}
