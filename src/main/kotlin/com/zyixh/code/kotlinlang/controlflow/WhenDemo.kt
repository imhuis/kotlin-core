package com.zyixh.code.kotlinlang.controlflow

/**
 * @author: imhuis
 * @date: 2023/8/14
 * @description:
 */
fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases(listOf("Hello", "MyClass`"))
    cases("hello")
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        is MyClass -> println("MyClass")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

class MyClass