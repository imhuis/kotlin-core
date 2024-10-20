package com.imhui.code.kotlinlang.basic

/**
 * @author: imhuis
 * @date: 2024/10/20
 * @description:
 */
fun main(args: Array<String>) {
    val str: String = "Hello World"
    println("String length is ${getStringLength1(str)}")
}

fun getStringLength1(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

// automatically cast to `String` in this branch
fun getStringLength2(obj: Any): Int? {
    if (obj !is String) return null

    // `obj` is automatically cast to `String` in this branch
    return obj.length
}