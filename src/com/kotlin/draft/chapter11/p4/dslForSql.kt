package com.kotlin.draft.chapter11.p4

import org.jetbrains.exposed.sql.*

object Country : Table() {
    val id = integer("id").autoIncrement().primaryKey()
    val name = varchar("name", 50)
}

/**
 * SchemaUtils.create(Country) ==
 *
 * CREATE TABLE IF NOT EXIST Country (
 *      id INT AUTO_INCREMENT NOT NULL,
 *      name VARCHAR(50) NOT NULL,
 *      CONSTRAINT pk_Country PRIMARY KEY (id)
 * )
 */
/*
val result = (Country join Customer)
        .select { Country.name eq "USA" }
result.forEach { println(it[Customer.name]) }
        */

/**
fun Table.select(where: SqlExpressionBuilder.() -> Op<Boolean>) : Query

object SqlExpressionBuilder {
    infix fun<T> Column<T>.eq(t: T) : Op<Boolean>
    //...
}
        */