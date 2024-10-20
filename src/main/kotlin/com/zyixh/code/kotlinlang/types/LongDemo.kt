package com.zyixh.code.kotlinlang.types

/**
 * @author: imhuis
 * @date: 2023/8/16
 * @description:
 */
fun main() {
    // Hypothetical code, does not actually compile:
    val a: Int? = 1 // A boxed Int (java.lang.Integer)
    val b: Int? = a // Implicit conversion yields a boxed Long (java.lang.Long)
    println(b == a) // Surprise! This prints "false" as Long's equals() checks whether the other is Long as well

    val x = 5 / 2
    println(x == 2)

    val u: UInt = 1u;

}