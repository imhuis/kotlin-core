package com.zyixh.code.kotlinlang.functions

/**
 * @author: imhuis
 * @date: 2023/8/15
 * @description:
 */

// All examples create a function object that performs upper-casing.
// So it's a function from String to String

val upperCase1: (String) -> String = { str: String -> str.uppercase() }

val upperCase2: (String) -> String = { str -> str.uppercase() }

val upperCase3 = { str: String -> str.uppercase() }

// need dec
//val upperCase4 = { str -> str.uppercase() }

val upperCase5: (String) -> String = { it.uppercase() }

val upperCase6: (String) -> String = String::uppercase

fun main() {
    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))
}
