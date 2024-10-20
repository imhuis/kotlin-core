package com.zyixh.code.kotlinlang.basic

/**
 * @author: imhuis
 * @date: 2023/8/13
 * @description:
 */
fun main(args: Array<String>) {
    println(args.contentToString())
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum(a: Float, b: Float) = a + b

fun sum(a: Number, b: Number): Unit {}