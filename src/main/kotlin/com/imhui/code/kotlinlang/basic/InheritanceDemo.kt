package com.imhui.code.kotlinlang.basic

/**
 * @author: imhuis
 * @date: 2023/8/14
 * @description:
 */
open class Dog {
    open fun sayHello() {
        println("wow wow!")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif!")
    }
}

fun main() {
//    val dog : Dog = Yorkshire()
//    dog.sayHello()
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}

open class Tiger(val origin: String) {
    open fun sayHello() {
        println("A tiger from $origin says: xxyy!")
    }
}

class SiberianTiger : Tiger("Siberia") {
    override fun sayHello() {
        println("A tiger from $origin says: xxyyzz!")
    }
}
