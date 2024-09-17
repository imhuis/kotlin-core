package com.zyixh.code.kotlinlang.controlflow

/**
 * @author: imhuis
 * @date: 2023/8/15
 * @description:
 */

val cakes = listOf("carrot", "cheese", "chocolate")


fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

fun main() {
    // for  loop
    println("for loop ======")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

    println("while loop ======")

    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {                    // 1
        eatACake()
        cakesEaten++
    }


    println("do-while loop ======")
    do {                                        // 2
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}