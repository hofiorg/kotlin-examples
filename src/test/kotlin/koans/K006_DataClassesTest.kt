package koans

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DataClassesTest {

    @Test
    fun testGetPeople() {
        assertEquals("Alice", getPeople()[0].name)
        assertEquals(29, getPeople()[0].age)

        assertEquals("Bob", getPeople()[1].name)
        assertEquals(31, getPeople()[1].age)
    }
}