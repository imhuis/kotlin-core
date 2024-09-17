package com.zyixh.code.kotlinlang.basic


// Integers
val year: Int = 2020

// Unsigned integers
val score: UInt = 100u

// Floating-point numbers
val currentTemp: Float = 24.5f
val price: Double = 19.99

// Booleans
val isEnabled: Boolean = true

// Characters
val separator: Char = ','

// Strings
val message: String = "Hello, world!"


// --------------------------------

fun main() {
    // Variable declared without initialization
    val d: Int
    // Variable initialized
    d = 3

    // Variable explicitly typed and initialized
    val e: String = "hello"

    // Variables can be read because they have been initialized
    println(d) // 3
    println(e) // hello
}