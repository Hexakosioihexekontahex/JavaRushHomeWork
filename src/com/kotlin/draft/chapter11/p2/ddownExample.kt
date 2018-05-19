package com.kotlin.draft.chapter11.p2

import kotlinx.html.*
import kotlinx.html.stream.createHTML

/**

    <div class="dropdown">
        <button class="btn dropdown-toggle">
            Dropdown
            <span class="caret"></span>
        </button>
        <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action></a></li>
            <li role="separator" class="divider"></li>
            <li class="dropdown-header">Header</li>
            <li><a href="#">Separated link</a></li>
        </ul>
    </div>
                                                        */

fun buildDropdown() = createHTML().div(classes = "dropdown") {
    button(classes = "btn dropdown-toggle") {
        +"Dropdown"
        span(classes = "caret")
    }
    ul(classes = "dropdown-menu") {
        li { a("#") { +"Action" } }
        li { a("#") { +"Another action" } }
        li { role = "separator"; classes = setOf("divider") }
        li { classes = setOf("dropdown-header"); +"Header" }
        li { a("#") { +"Separated link" } }
    }
}

/**

fun dropdownExample() = createHTML().dropdown {
    dropdownButton { +"Dropdown"}
    dropdownMenu {
        item("#", "Action")
        item("#", "Another action")
        divider()
        dropdownHeader("Header")
        item("#", "Separated link")
    }
}

fun UL.item(href: String, name: String) = li { a(href) { +name } }

fun UL.divider() = li { role = "separator"; classes = setOf("divider") }

fun UL.dropdownHeader(text: String) =
li { classes = setOf("dropdown-header"); +text }

fun DIV.dropdownMenu(block: UL.() -> Unit) = ul("dropdown-menu", block)

fun StringBuilder.dropdown(
block: DIV.() -> Unit
): String = div("dropdown", block)
                                                                         */
