package com.imhui.code.kotlinlang.basic

/**
 * @author: imhuis
 * @date: 2023/8/14
 * @description:
 */

open class Shape

class Rectangle(var height: Double, var length: Double) : Shape() {
    var perimeter = (height + length) * 2
}

val rectangle = Rectangle(10.0, 10.0)

class Customer
class Contact(val id: Int, var email: String)

fun main() {

    val customer = Customer()

    val contact = Contact(1, "xinghe@gmail.com")

    println(contact.id)
    contact.email = "nike@gmail.com"
    println(contact.email)
}