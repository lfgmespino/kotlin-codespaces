package com.example.app

fun suma(a: Int, b: Int): Int = a + b

fun areaRect(ancho: Double, alto: Double): Double = ancho * alto

fun saludo(nombre: String): String = "Hola, $nombre"

fun parseEdad(s: String): Int? = s.toIntOrNull()

fun saludoSeguro(nombre: String?): String {
    val limpio = nombre?.trim()
    val mostrado = if (limpio.isNullOrEmpty()) "desconocido" else limpio
    return "Hola, $mostrado"
}
