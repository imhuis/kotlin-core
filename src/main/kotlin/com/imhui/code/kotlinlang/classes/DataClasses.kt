package com.imhui.code.kotlinlang.classes

/**
 * @author: imhuis
 * @date: 2023/8/15
 * @description:
 */
data class User(val username: String, val email: String, val password: String) {
    override fun equals(other: Any?): Boolean {
        return other is User && username == other.username
    }
}

fun main() {
    val user = User("name", "@email.com", "password")
    println(user)
    println(user.hashCode())
    println(user.toString())


    val user1 = User("name", "@email.com", "password")
    println(user == user1) // true

    val user2 = User("name", "abc@email.com", "password")
    println(user == user2) // true

}