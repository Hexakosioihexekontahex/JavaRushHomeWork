package com.kotlin.draft.chapter04.p4

import java.awt.Window
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

// модуль реализации бизнесс-логики
class Per_son(val fullName: String, val lastName: String){
    companion object {
        //empty
    }
}

// модуль реализации взаимодействий между клиентом и сервером
fun Per_son.Companion.fromJSON(json: String) : Per_son { //ф-ция расширение
    /* some code */
    return Per_son("abra", "kadabra")
}

fun main(args: Array<String>) {
    /* ... */
//    val p = Per_son.fromJSON(json)
    /**
     * реализация обработчика событий с помощью анонимного объекта
     * (аналог анонимного внутреннего класса)
     *
    window.addMouseListener(
            object : MouseAdapter(){ // объявление анонимного объекта, наследующего MouseAdapter

                //переопределение методов MouseAdapter
                override fun mouseClicked(e: MouseEvent?) {
                    // ...
                }

                override fun mouseEntered(e: MouseEvent?) {
                    // ...
                }
            }
    )
     */

    //или
    val listener = object : MouseAdapter(){ //если требуется дать имя
        override fun mouseClicked(e: MouseEvent) {
            /*...*/
        }

        override fun mouseEntered(e: MouseEvent) {
            /*...*/
        }
    }

}

fun countClicks(window: Window){
    var clickCount = 0

    window.addMouseListener(object : MouseAdapter(){
        override fun mouseClicked(e: MouseEvent) {
            clickCount++ //можно обращаться не только к локальным финальным переменным (как в Java)
        }
    })
    /*....*/
}
