package com.imhui.code.kotlinlang.basic

/**
 * @author: imhuis
 * @date: 2023/8/14
 * @description:
 */


fun main() {
    val list = listOf("a", "b", "c")

    println(list.lastIndex)
    println(list.indices)

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }

    for (i in 0..3) {
        print(i) // 0123
    }
    print(" ")

    for (i in 0 until 3) {
        print(i) // 012
    }
    print(" ")

    for (i in 2..8 step 2) {
        print(i) // 2468
    }
    print(" ")

    for (i in 3 downTo 0) {
        print(i) // 3210
    }
    print(" ")

}