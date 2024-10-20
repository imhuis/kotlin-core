package com.imhui.code.kotlinlang.classes

/**
 * @author: imhuis
 * @date: 2023/8/16
 * @description:
 */
open class Base(p : Int)

class Derived(p: Int) : Base(p) {

}

open class Rectangle(private val width: Int, private val height: Int) {
    open fun draw() { /* ... */ }
    val area: Int
        get() = this.width * this.height
}

interface Polygon {
    fun draw() { /* ... */ } // interface members are 'open' by default
}

class Square(width: Int, height: Int) : Rectangle(width, height), Polygon {
    // The compiler requires draw() to be overridden:
    override fun draw() {
        TODO("Not yet implemented")
        super<Rectangle>.draw() // call to Rectangle.draw()
        super<Polygon>.draw() // call to Polygon.draw()
    }
}

class ABC(val a: String) {
//    val a: String //error
    // val must initialize
    val b:String? = null
}