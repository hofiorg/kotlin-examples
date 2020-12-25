package koans

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class HelloWorldTest {
    @Test
    fun testStart() {
        assertEquals("OK", start())
    }
}