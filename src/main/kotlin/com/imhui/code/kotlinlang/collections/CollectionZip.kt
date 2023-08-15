package com.imhui.code.kotlinlang.collections

/**
 * @author: imhuis
 * @date: 2023/8/15
 * @description:
 */

val A = listOf("a", "b", "c")
val B = listOf(1, 2, 3, 4)

val resultPairs = A zip B
val resultReduce = A.zip(B) { a, b -> "$a$b" }
val resultPairs2 = B zip A


fun main() {
    println(resultPairs)
    println(resultReduce)
    println(resultPairs2)
}