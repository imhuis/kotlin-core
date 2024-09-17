package com.zyixh.code.kotlinlang.functions


fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun main() {
    // Uses named arguments with swapped parameter order
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // [Log] Hello
    printMessageWithPrefix(message = "System UP!")
    // [Info] System UP!


    val numbers = listOf(1, -2, 3, -4, 5, -6)


    val positives = numbers.filter({ x -> x > 0 })

    val isNegative = { x: Int -> x < 0 }
    val negatives = numbers.filter(isNegative)

    println(positives)
// [1, 3, 5]
    println(negatives)
// [-2, -4, -6]
}
