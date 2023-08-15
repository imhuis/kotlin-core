package com.imhui.code.kotlinlang.collections

/**
 * @author: imhuis
 * @date: 2023/8/15
 * @description:
 */

val mutableList = mutableListOf(1, 2, 3, 4, 5, 6)
val list: List<String> = listOf(".", ",", "!")

fun addToList(i: Int) {
    mutableList.add(i)
}

fun getLists(): List<String> {
    return list
}

fun main() {
    addToList(8)
    println(mutableList.size)

    getLists().forEach {
            i ->
        println("dot is $i")
    }
}