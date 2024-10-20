package com.imhui.code.kotlinlang.types

/**
 * @author: imhuis
 * @date: 2023/8/16
 * @description:
 */


fun main() {
    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 10000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA == anotherBoxedA) // true
    println(boxedA === anotherBoxedA) // true
    println(boxedB == anotherBoxedB) // true
    println(boxedB === anotherBoxedB) // false


//    val b: Int = 10000
//    println(b == b) // Prints 'true'
//    val boxedB: Int? = b
//    val anotherBoxedB: Int? = b
//    println(boxedB == anotherBoxedB) // Prints 'true'
//    println(boxedB === anotherBoxedB) // Prints 'false'
}