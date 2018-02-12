package com.kotlin.draft.chapter02

/*
Java

public class Person {
    private final String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

Kotlin

class Person(val name: String)
 */


class Person(val name: String, var isMarried: Boolean)