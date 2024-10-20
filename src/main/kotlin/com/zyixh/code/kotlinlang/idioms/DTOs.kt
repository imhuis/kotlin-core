package com.zyixh.code.kotlinlang.idioms

/**
 * @author: imhuis
 * @date: 2023/8/14
 * @description:
 */
data class DTOs(val name:String)

fun defaultValueForFunction(name:String = "default") {}

var listt = listOf("", "")
fun filter(list:List<Int>) {
    list.filter { it != 0 }
}

/* read only list and map */
val list = listOf("a", "b", "c")
val map = mapOf("a" to 1, "b" to 2, "c" to 3)

//val p:String by lazy {
//
//}

fun String.spaceToCamelCase() {}

fun stringTest(s: String): String {
    s.spaceToCamelCase()
    return s
}
