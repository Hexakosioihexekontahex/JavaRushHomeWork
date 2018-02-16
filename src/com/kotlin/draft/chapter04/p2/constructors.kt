package com.kotlin.draft.chapter04.p2

//////////////////////////////////////////////////
                                                //
class User2 constructor(_nickname: String) {    //
    val nickname: String                        //
                                                //
    init {                                      //
        nickname = _nickname                    //
    }                                           //
}                                               //   одно и то же
                                                //
class User1(_nickname: String) {                //
    val nickname = _nickname                    //
}                                               //
                                                //
open class User(val nickname: String) {/*...*/} //
                                                //
//////////////////////////////////////////////////

class TwitterUser(nickname: String) : User(nickname) {/*...*/}

open class Button //будет сгенерирован конструктор по умолчанию
                          //поэтому
class RadioButton : Button()

class Secretive private constructor(){/*...*/}
//другой код не сможет создать экземпляр данного класса

