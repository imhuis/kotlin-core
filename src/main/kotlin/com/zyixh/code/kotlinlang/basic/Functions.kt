package com.zyixh.code.kotlinlang.basic

/**
 * @author: imhuis
 * @date: 2023/8/14
 * @description:
 */
fun printAll(vararg messages: String) {
    for (message in messages) println(message)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (m in messages) println(prefix + m)
}

fun log(vararg entries: String) {
    com.zyixh.code.kotlinlang.basic.printAll(*entries)
}

fun main() {
    com.zyixh.code.kotlinlang.basic.printAll("Hello", "Hallo", "Salut", "Hola", "你好")

    com.zyixh.code.kotlinlang.basic.printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "
    )

    com.zyixh.code.kotlinlang.basic.log("Hello", "Hallo", "Salut", "Hola", "你好")
}