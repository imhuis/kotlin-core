package com.zyixh.code.kotlinlang.collections

/**
 * @author: imhuis
 * @date: 2023/8/15
 * @description:
 */

val numbers = listOf(1, -2, 3, -4, 5, -6)
val positiveNumbers = listOf(1, 2, 4)

val anyNegative = numbers.any { it < 0 }
val anyGT6 = numbers.any { it > 6 }
val allFT0 = positiveNumbers.all { it >= 0 }
val allLess0 = positiveNumbers.none { it < 0 }

fun main() {

//    println(anyNegative) // true
//    println(positiveNumbers.any { it < 0 }) // false
//    println(anyGT6) // false

//    println(allFT0) // true
//    println(allLess0) // true

    println("$first, $last, $nothing")
}


val words = listOf("Lets", "find", "something", "in", "collection", "somehow", "nothing", "nothings")

val first = words.find { it.startsWith("some") }
val last = words.findLast { it.startsWith("some") }

val nothing = words.find { it.contains("nothing") }