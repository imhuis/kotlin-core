package com.zyixh.code.kotlinlang.basic

/**
 * @author: imhuis
 * @date: 2023/8/14
 * @description:
 */

fun main() {
    // able, a compilation error is produced.
    var nullable: String? = "You can keep a null here"
    nullable = null
//    strLength(nullable)
    val result = describeString(nullable)
    print("result: $result")
}

fun strLength(notNull: String): Int {
    return notNull.length
}

fun describeString(maybeString: String?): String {
    return if (maybeString != null && maybeString.isNotEmpty()) {
        "String of length ${maybeString.length}"
    } else {
        "Empty or null string"
    }
}