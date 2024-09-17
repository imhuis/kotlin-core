package com.zyixh.code.kotlinlang.classes

/**
 * @author: imhuis
 * @date: 2023/8/15
 * @description:
 */
data class User(val username: String, val email: String = "example@gmail.com", val password: String) {
    override fun equals(other: Any?): Boolean {
        return other is User && username == other.username
    }
}

fun main() {
    val user = User("name", "zy@email.com", "password")
    println(user)
    println(user.hashCode())
    println(user.toString())


    val user1 = User("name", "@email.com", "password")
    println(user == user1) // true

    val user2 = User("name", "abc@email.com", "password")
    println(user == user2) // true

}