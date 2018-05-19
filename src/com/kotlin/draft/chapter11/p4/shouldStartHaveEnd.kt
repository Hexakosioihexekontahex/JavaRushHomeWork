package com.kotlin.draft.chapter11.p4

import io.kotlintest.matchers.should
import io.kotlintest.matchers.startWith

fun main(args: Array<String>) {
    "kotlin" should startWith("kot")
    "kotlin" should start with "kot"
    "kotlin" should end with "in"
    "kotlin" should have substring "otl"
}

//infix fun <T> T.should(matcher: Matcher<T>) = matcher.test(this)
//
//interface Matcher<T> {
//    fun test(value: T)
//}
//
//class startWith(val prefix: String) : Matcher<String> {
//    override fun test(value: String) {
//        if (!value.startsWith(prefix)) {
//            throw AssertionError("String $value does not start with $prefix")
//        }
//    }
//}

object start

infix fun String.should(x: start): StartWrapper = StartWrapper(this)

class StartWrapper(val value: String) {
    infix fun with(prefix: String) =
            if (!value.startsWith(prefix)) {
                throw AssertionError(
                        "String does not start with $prefix: $value")
            } else { }
}


object end

infix fun String.should(x: end): EndWrapper = EndWrapper(this)

class EndWrapper(val value: String) {
    infix fun with(postfix: String) =
            if (!value.endsWith(postfix)) {
                throw AssertionError(
                        "String does not ends with $postfix: $value"
                )
            } else { }
}

object have

infix fun String.should(x: have): HaveWrapper = HaveWrapper(this)

class HaveWrapper(val value: String) {
    infix fun substring(substring: String) =
            if (!value.contains(substring)) {
                throw AssertionError(
                        "String does not contains substring $substring: $value"
                )
            } else { }
}
