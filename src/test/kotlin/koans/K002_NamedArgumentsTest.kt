package koans

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class NamedArgumentsTest {

    @Test
    fun testJoinOptions() {
        assertEquals("[a, b, c]", joinOptions(listOf("a", "b", "c")))
    }
}