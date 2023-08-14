package com.imhui.code.kotlinlang.controlflow

/**
 * @author: imhuis
 * @date: 2023/8/15
 * @description:
 */

class Animal(val name: String)

class Zoo(private val animals: List<Animal>) {
    // keyword: operator must be named iterator and have the operator modifier
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }

    val abc = listOf(Animal("zebra"), Animal("lion"))
    for (a in abc) {
        println(a.name)
    }

}