package com.example.app

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class BasicsTest {

    @Test
    fun suma_basica() {
        assertEquals(7, suma(3, 4))
    }

    @Test
    fun area_rectangulo() {
        assertEquals(6.0, areaRect(3.0, 2.0), 1e-9)
    }

    @Test
    fun saludo_simple() {
        assertEquals("Hola, Luis", saludo("Luis"))
    }

    @Test
    fun parseo_edad() {
        assertEquals(29, parseEdad("29"))
        assertNull(parseEdad("veintinueve"))
        assertNull(parseEdad(""))
    }

    @Test
    fun saludo_seguro_null_o_vacio() {
        assertEquals("Hola, desconocido", saludoSeguro(null))
        assertEquals("Hola, desconocido", saludoSeguro(""))
        assertEquals("Hola, Ana", saludoSeguro("  Ana  "))
    }
}
