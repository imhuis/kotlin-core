package com.zyixh.code.kotlinlang.controlflow

/**
 * @author: imhuis
 * @date: 2023/8/15
 * @description:
 */

fun main() {


    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // true
    println(authors === writers)  // false

    // a == b compiles down to if (a == null) b == null else a.equals(b)
    /**
     * ==  for structural comparison
     * === for referential comparison
     **/
}