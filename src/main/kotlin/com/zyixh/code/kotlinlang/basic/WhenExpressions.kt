package com.imhui.code.kotlinlang.basic

/**
 * @author: imhuis
 * @date: 2024/10/20
 * @description:
 */
fun main(args: Array<String>) {
    describe("Hello")
}

fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }