package com.kotlin.draft.chapter04.p1.internalAndNestedClasses

class Button : View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {
        /*...*/
    }

    class ButtonState : State { /*..*/ } //аналог статического вложенного класса в Java
}