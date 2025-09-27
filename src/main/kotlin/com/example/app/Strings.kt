package com.example.app

fun esPalindromo(s: String): Boolean {
    val t = s.lowercase().filter { it.isLetterOrDigit() }
    return t == t.reversed()
}
