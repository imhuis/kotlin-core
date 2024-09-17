package com.zyixh.code.kotlinlang.functional

/**
 * @author: imhuis
 * @date: 2023/8/15
 * @description:
 */
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y
fun minus(x: Int, y: Int) = x - y

fun main() {
    val sumResult = calculate(4, 5, ::sum)
    val minusResult = calculate(10, 1, ::minus)
    val mulResult = calculate(4, 5) { a, b -> a * b }
    println("sumResult $sumResult, minusResult $minusResult, mulResult $mulResult")


    val func = operation()
    println(func(2))
//    println(operation())
}

fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x