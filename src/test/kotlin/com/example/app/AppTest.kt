package com.example.app

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse

class PalindromoTest {

    @Test
    fun vacioOSoloSignos() {
        assertTrue(esPalindromo(""))
        assertTrue(esPalindromo("...,,,   !!!"))
    }

    @Test
    fun unCaracter() {
        assertTrue(esPalindromo("A"))
        assertTrue(esPalindromo("7"))
    }

    @Test
    fun clasicos() {
        assertTrue(esPalindromo("Anita lava la tina"))
        assertTrue(esPalindromo("No 'x' in Nixon"))
    }

    @Test
    fun numeros() {
        assertTrue(esPalindromo("12321"))
        assertFalse(esPalindromo("1231"))
    }

    @Test
    fun noPalindromos() {
        assertFalse(esPalindromo("Kotlin mola"))
        assertFalse(esPalindromo("abca"))
    }
}

