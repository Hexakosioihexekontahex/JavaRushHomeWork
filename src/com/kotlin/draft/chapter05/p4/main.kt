package com.kotlin.draft.chapter05.p4

/* button.setOnClockListener { actions on click } */

/* Java */
//public class Button {
//    public void setOnClickListener(OnClickListener l) { ... }
//}
//public interface OnClickListener { SAM-интерфейс (или функциональный)
//    void onClick(View v);          Single Abstract Method
//}
/* Kotlin */
//button.setOnClickListener { view -> ... }

/* Java */
//void postponeComputation(int delay, Runnable computation);
/* Kotlin */
//postponeComputation(1000) { println(42) }
//или
//postponeComputation(1000, object : Runnable {//явное объявление объекта (каждый вызов ==
//    override fun run() {                      новый объект, в отличии от предыдущего варианта)
//        println(42)
//    }
//})
//или
//val runnable = Runnable { println(42) } //объявление с захватом переменной
//fun handleComputation(){
//    postponeComputation(1000, runnable) //передается тот же экземпляр Runnable
//}

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}

fun main(args: Array<String>) {
    createAllDoneRunnable().run()
}

//val listener = OnClickListener { view ->
//    val text = when (view.id) {
//        R.id.button1 -> "First button"
//        R.id.button2 -> "Second button"
//        else -> "Unknown button"
//    }
//    toast(text)
//}
//button1.setOnClickListener(listener)
//button2.setOnClickListener(listener)