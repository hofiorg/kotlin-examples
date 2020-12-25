package koans

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class StringsTest {

    @Test
    fun testGetPattern() {
        assertTrue(getPattern().toRegex().matches("13 JUN 1992"))
        assertFalse(getPattern().toRegex().matches("13.07.1992"))
    }
}