package com.zyixh.code.kotlinlang.collections

/**
 * @author: imhuis
 * @date: 2023/8/15
 * @description:
 */

val mutableList = mutableListOf(1, 2, 3, 4, 5, 6)
// immutable list
val list: List<String> = listOf(".", ",", "!")

val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
// casting(铸造)
val readOnlyShapes: List<String> = shapes

fun addToList(i: Int) {
    mutableList.add(i)
}

fun removeToList(i: Int) {
    // remove the first element in list
    mutableList.remove(i)
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

    println("This list has ${readOnlyShapes.count()} items")
    println("The first item in the list is: ${readOnlyShapes[0]}")

    println("The first item in the list is: ${readOnlyShapes.first()}")
    println("The last item in the list is: ${readOnlyShapes.last()}")

    println("circle" in readOnlyShapes)
}