
    @Test
    fun `palindromo clasico`() {
        assertTrue(esPalindromo("Anita lava la tina"))
    }

    @Test
    fun `no palindromo`() {
        assertFalse(esPalindromo("Kotlin mola"))
    }
