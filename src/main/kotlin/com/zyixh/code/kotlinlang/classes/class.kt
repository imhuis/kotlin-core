package com.zyixh.code.kotlinlang.classes

import kotlin.random.Random

class Contact(private val id: Int, var email: String) {
    fun getID(): Int {
        return id
    }
}


data class Employee(val name: String, var salary: Int)

class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    val names = listOf("John", "Mary", "Ann", "Paul", "Jack", "Elizabeth")
    fun generateEmployee() =
        Employee(
            names.random(),
            Random.nextInt(from = minSalary, until = maxSalary)
        )
}

fun main() {
    val contact = Contact(1, "my@gmail.com")
    contact.email = "my123@gmail.com"
    println(contact)

    println("=========")
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}


