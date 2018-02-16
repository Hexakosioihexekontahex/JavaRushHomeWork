package com.kotlin.draft.chapter04.p2

class Context
class AttributeSet

open class View {
    constructor(ctx: Context) {
        // some code
    }

    constructor(ctx: Context, attr: AttributeSet){
        // some code
    }
}

class MyButton : View {
    constructor(ctx: Context) : super(ctx) {
        // ...
    }
    //or
//    constructor(ctx: Context) : this(ctx, MY_STYLE){/*...*/}

    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {
        // ...
    }
}