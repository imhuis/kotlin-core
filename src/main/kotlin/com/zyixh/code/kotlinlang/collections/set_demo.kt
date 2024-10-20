package com.zyixh.code.kotlinlang.collections

/**
 * @author: imhuis
 * @date: 2023/8/15
 * @description:
 */


val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
// Mutable set with explicit type declaration
val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
val fruitLocked: Set<String> = fruit

// sets are unordered, you can't access an item at a particular index.

fun addToSet(str: String): Boolean {
    return fruit.add(str)
}

fun removeToSet(str: String): Boolean {
    return fruit.remove(str)
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."
}

fun main() {
    println(readOnlyFruit)

    println("This set has ${readOnlyFruit.count()} items")
    println("Banana".lowercase() in readOnlyFruit)

    val aNewIssue: String = "Guava"
    val anIssueAlreadyIn: String = "banana"

    println("Issue $aNewIssue ${getStatusLog(addToSet(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatusLog(addToSet(anIssueAlreadyIn))}")
}