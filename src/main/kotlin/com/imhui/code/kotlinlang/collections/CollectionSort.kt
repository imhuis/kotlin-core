package com.imhui.code.kotlinlang.collections

import java.lang.Math.abs

/**
 * @author: imhuis
 * @date: 2023/8/15
 * @description:
 */

val shuffled = listOf(5, 4, 2, 1, 3, -10)
val natural = shuffled.sorted()
val inverted = shuffled.sortedBy { -it }
val descending = shuffled.sortedDescending()
val descendingBy = shuffled.sortedByDescending { abs(it) }

fun main() {
    println("Shuffled $shuffled")
    println(natural)
    println(inverted)
    println(descending)
    println(descendingBy)
}