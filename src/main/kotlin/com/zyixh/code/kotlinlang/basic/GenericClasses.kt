package com.zyixh.code.kotlinlang.basic

/**
 * @author: imhuis
 * @date: 2023/8/14
 * @description:
 */

class MutableStack<E>(vararg items: E) {

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun main() {
    val mutableStack = com.zyixh.code.kotlinlang.basic.MutableStack("a", "b", "c")
    println(mutableStack.size())

    val stack = com.zyixh.code.kotlinlang.basic.mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}

fun <E> mutableStackOf(vararg elements: E): com.zyixh.code.kotlinlang.basic.MutableStack<E> =
    com.zyixh.code.kotlinlang.basic.MutableStack(*elements)