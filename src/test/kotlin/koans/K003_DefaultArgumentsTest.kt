package koans

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DefaultArgumentsTest {

    @Test
    fun testUseFoo() {
        assertEquals(listOf("a42", "b1", "C42", "D2"), useFoo())
    }
}