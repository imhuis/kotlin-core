package com.imhui.code.kotlinlang.classes

import jakarta.inject.Inject

/**
 * @author: imhuis
 * @date: 2023/8/16
 * @description:
 */
class Person constructor (private val firstName: String, lastName: String) {

//    constructor(lastName: String) : this(lastName) {
//
//    }

    init {
        println("First initializer block that prints $firstName")
    }
}

// If the constructor has annotations or visibility modifiers, the constructor keyword is required and the modifiers go before it
class Persons @Inject constructor (firstName: String) {

}