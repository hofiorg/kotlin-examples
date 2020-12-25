package koans

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class LambdasTest {

    @Test
    fun testContainsEven() {
        assertTrue(containsEven(listOf(1, 2, 3)))
        assertFalse(containsEven(listOf(1, 3, 5)))
    }
}