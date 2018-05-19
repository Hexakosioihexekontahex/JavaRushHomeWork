package com.kotlin.draft.chapter11.p2


open class Tag(val name: String) {
    private val children = mutableListOf<Tag>()

    protected fun <T : Tag> doInit(child: T, init: T.() -> Unit) {
        child.init()
        children.add(child)
    }

    override fun toString() =
            "<$name>${children.joinToString("")}</$name>"
}

fun table(init: TABLE.() -> Unit) = TABLE().apply(init)

class TABLE : Tag("table") {
    fun tr(init : TR.() -> Unit) = doInit(TR(), init)
}

class TR : Tag("tr") {
    fun td(init : TD.() -> Unit) = doInit(TD(), init)
}

class TD : Tag("td")

fun createTable() =
        table {
            tr {
                td { /*+"cell"*/ }
            }
        }

fun main(args: Array<String>) {
    println(createTable())
    println(createAnotherTable())
}

fun createAnotherTable() = table {
    for (i in 1..2) {
        tr {
            td{
            }
        }
    }
}
