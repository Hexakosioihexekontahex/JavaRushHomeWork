package com.kotlin.draft.chapter04.p1.internalAndNestedClasses

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State){}
}