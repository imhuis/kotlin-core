package com.zyixh.code.kotlinlang.functions

fun sumDemo1(a: Int, b: Int): Int {
    return a + b
}

// expression
fun sumDemo2(a: Int, b: Int) = a + b

// Unit: returns no meaningful value
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

// Unit return type can be omitted
fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}