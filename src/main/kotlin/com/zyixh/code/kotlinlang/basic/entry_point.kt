package com.zyixh.code.kotlinlang.basic



fun main(args: Array<String>) {
    // Print to the standard output
    println(args.contentToString())

    // Read from the standard input
    println("Enter any word: ")
    val kw = readln()
    println("read from console: $kw")
}