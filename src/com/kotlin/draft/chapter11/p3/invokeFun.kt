package com.kotlin.draft.chapter11.p3

/**
        foo[bar] == foo.get(bar)
        */

class Greeter(val greeting: String) {
        operator fun invoke(name: String) {
                println("$greeting, $name!")
        }
}

/**
interface Function2<in P1, in P2, out R> {
        operator fun invoke(p1: P1, p2: P2): R
}
        */

data class Issue(
        val id: String, val project: String, val type: String,
        val priority: String, val description: String
)

class ImportantIssuesPredicate(val project: String)
        : (Issue) -> Boolean {
        override fun invoke(issue: Issue): Boolean {
                return issue.project == project && issue.isImportant()
        }
        private fun Issue.isImportant(): Boolean {
                return type == "Bug" &&
                        (priority == "Major" || priority == "Critical")
        }
}

class DependencyHandler {
        fun compile(coordinate: String) {
                println("Added dependency on $coordinate")
        }

        operator fun invoke(
                body: DependencyHandler.() -> Unit) {
                body()
        }
}

fun main(args: Array<String>) {
        val bavarianGreeter = Greeter("Servus")
        bavarianGreeter("Dmitry")

        val i1 = Issue("IDEA-154446", "IDEA", "Bug", "Major",
                "Save settings failed")
        val i2 = Issue("KT-12183", "Kotlin", "Feature", "Normal",
                "Intention: convert several calls on the same receiver to with/apply")
        val predicate = ImportantIssuesPredicate("IDEA")
        for (issue in listOf(i1, i2).filter(predicate)) {
                println(issue.id)
        }

        val dependencies = DependencyHandler()

        dependencies.compile("org.jetbrains.kotlin:kotlin-stdlib:1.0.0")
        dependencies{
                compile("org.jetbrains.kotlin:kotlin-reflect:1.0.0")
        }
        /**
         dependencies.invoke({
                this.compile("org.jetbrains.kotlin:kotlin-reflect:1.0.0")
         })
         */
}
