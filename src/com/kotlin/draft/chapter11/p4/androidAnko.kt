package com.kotlin.draft.chapter11.p4

/**
fun Activity.showAreYouSureAlert(process: () -> Unit) {
    alert(title = "Are you sure?",
            message = "Are you really sure?") {
        positiveButton("Yes") { process() }
        negativeButton("No") { cancel() }
    }
}

fun Context.alert(
        message: String,
        title: String,
        init: AlertDialogBuilder.() -> Unit
)

class AlertDialogBuilder {
    fun positiveButton(text: String, callback: DialogInterface.() -> Unit)
    fun negativeButton(text: String, callback: DialogInterface.() -> Unit)
    // ...
}
        */

/**
verticalLayout {
    val email = editText {
        hint = "Email"
    }
    val password = editText {
        hint = "Password"
        transformationMethod =
                PasswordTransformationMethod.getInstance()
    }
    button("Log In") {
        onClick {
            logIn(email.text, password.text)
        }
    }
}
        */
