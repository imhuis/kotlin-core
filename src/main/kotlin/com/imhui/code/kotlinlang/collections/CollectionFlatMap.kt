package com.imhui.code.kotlinlang.collections

/**
 * @author: imhuis
 * @date: 2023/8/15
 * @description:
 */

val fruitsBag = listOf("apple","orange","banana","grapes")
val clothesBag = listOf("shirts","pants","jeans")
val cart = listOf(fruitsBag, clothesBag)
val mapBag = cart.map { it }
val flatMapBag = cart.flatMap { it }
val flatMap = cart.flatten()


fun main() {
    println(mapBag)
    println(flatMapBag)
    println(flatMap)
}