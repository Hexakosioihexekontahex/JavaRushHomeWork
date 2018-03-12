package com.kotlin.draft.chapter05.p5

fun alphabet1(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder){
        for (letter in 'A'..'Z'){
            this.append(letter)
        }
        this.append("\nNow I know the alphabet!")
        this.toString()
    }
}

fun alphabet2() = with(StringBuilder()){
    for (letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}

fun alphabet3() = StringBuilder().apply {
    for (letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()

fun main(args: Array<String>) {
    println(alphabet3())
}

/**
   fun createViewWithCustomAttributes(context: Context) =
        TextView(context).apply{
        text = "Sample Text"
        textSize = 20.0
        setPadding(10. 0, 0, 0)
   }
*/

fun alphabet4() = buildString {
    for (letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow I know the alphabet!")
}