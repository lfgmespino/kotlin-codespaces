package com.example.app

fun media(nums: List<Int>): Double =
    if (nums.isEmpty()) 0.0 else nums.sum().toDouble() / nums.size

fun main() {
    println("¡Hola desde Kotlin en Codespaces!")
    println("Media de 2,4,6 = " + media(listOf(2,4,6)))
}
