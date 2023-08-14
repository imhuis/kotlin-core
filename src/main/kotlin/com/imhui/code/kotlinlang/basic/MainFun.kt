package com.imhui.code.kotlinlang.basic

/**
 * @author: imhuis
 * @date: 2023/8/13
 * @description:
 */
fun main(args: Array<String>) {
    println(args.contentToString())
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum(a: Float, b: Float) = a + b

fun sum(a: Number, b: Number): Unit {}

val a: String = "Hello, world!"
var b: String = "Hello, world!"

fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }