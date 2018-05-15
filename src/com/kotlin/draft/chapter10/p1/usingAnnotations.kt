@file:JvmName("UsingAnnotations")

package com.kotlin.draft.chapter10.p1

import org.junit.*
import org.junit.rules.TemporaryFolder

class MyClass {
    @Test
    fun testTrue() {
        Assert.assertTrue(true)
    }
}

@Deprecated("Use removeAt(index) instead.",
//не только покажет какая ф-ция должна использовааться взамен
        ReplaceWith("removeAt(index"))
//, но также предложит возможность выполнить замену автоматически
fun remove(index: Int) { /*...*/ }

/**
 * @MyAnnotation(MyClass::class)// чтобы передать в параметре класс
 *
 * @RequestMapping(path = arrayOf("/foo", "/bar")) // чтобы передать массив, использовать arrayOf
 */

//свойство как аргумент аннотации должно быть константой времени компиляции
const val TEST_TIMEOUT = 100L

@Test(timeout = TEST_TIMEOUT) fun testMethod() { /*...*/}

//@get:Rule // синтаксис объявления цели аннотации
class HasTepFolder {
    @get:Rule // аннотируется метод чтения, а не свойство
    val folder = TemporaryFolder()

    @Test
    fun testUsingTempFolder() {
        val createFile = folder.newFile("myfile.txt")
        val createFolder = folder.newFolder("subfolder")
        // ...
    }
}

/**
        @property: - Java-аннотации не могут применяться с этим объявлением цели
        @field: -    поле, сгенерированное для свойства
        @get: -      метод чтения свойства
        @set: -      метод записи свойства
        @receiver: - параметр-получатель ф-ции-расширения или свойства-расширения
        @param: -    параметр конструктора
        @setparam: - параметр метода записи в свойство
        @delegate: - поле, хранящее экземпляр делегата для делегированного свойства
        @file: -     класс, содержащий функции и свойства верхнего уровня, объявленные в файле
        */

/**
        @JvmName изменяет имя Java-метода или поля, сгенерированного на основе Kotlin-объявления.
        @JvmStatic может применяться к методам в объявлениях объектов или объектов-компаньонов, чтобы со стороны Java
            они выглядили как статические методы.
        @JvmOverloads требует от компилятора Kotlin сгенерировать перегруженные версии функций с параметрами, имеющими
            значения по умолчанию.
        @JvmField позволяет открыть доступ к свойству как к общедоступному Java-полю, без методов чтения/записи.
        */

fun test(list: List<*>) {
    @Suppress("UNCHECKED_CAST")
    val strings = list as List<String>
    // ...
}

