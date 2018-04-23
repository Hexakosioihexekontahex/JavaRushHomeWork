package com.kotlin.draft.chapter03

class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave(){
    fun validate(value: String, fieldName: String){
        if(value.isEmpty()){
            throw IllegalArgumentException(
                    "Can't save user $id: empty $fieldName")
            //к свойствам класса User можно обращаться напрямую
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser(user: User){
    user.validateBeforeSave() //вызов функции-расширения

    /*Сохранение пользователя в базу*/
}