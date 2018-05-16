package com.kotlin.draft.chapter11.p1

/**
        StringUtil.capitalize(s) => s.capitalize()
        1.to("one") => 1 to "one"
        set.add(2) => set += 2
        map.get("key") => map["key"]
        file.use({ f -> f.read() }) => file.use { it.read() }

        sb.append("yes")        with (sb) {
        sb.append("no")  =>         append("yes")
                                    append("no")
                                }

        val yesterday = 1.days.ago

        fun createSimpleTable() = createHTML().
            table {
                tr {
                    td { +"cell"}
                }
            }

        */

/**
        SELECT Country.name, COUNT(Customer.id)
            FROM Country
            JOIN Customer
              ON Country.id = Customer.country_id
        GROUP BY Country.name
        ORDER BY COUNT(Customer.id) DESC
            LIMIT 1

        ||||||||||||||||||||||||||||||||||||||||||

        (Country join Customer)
            .slice(Country.name, Count(Customer.id))
            .selectAll()
            .groupBy(Country.name)
            .orderBy(Count(Customer.id), isAsc = false)
            .limit(1)

        */

/**
        str should startWith("kot") // assertTrue(str.startsWith("kot")
        */

/**
fun createAnotherTable() = createHTML().table {
    val numbers = mapOf(1 to "one", 2 to "two")
    for ((num, string) in numbers) {
        tr {
            td { +"$num" }
            td { +string }
        }
    }
}

 <table>
    <tr>
        <td>1</td>
        <td>one</td>
    </tr>
    <tr>
        <td>2</td>
        <td>two</td>
    </tr>
 </table>

        */
