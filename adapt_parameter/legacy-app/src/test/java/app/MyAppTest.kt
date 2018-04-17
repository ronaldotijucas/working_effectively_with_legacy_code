package app

import org.junit.Assert.assertEquals
import org.junit.Test

class MyAppTest {
    @Test fun testMyLanguage() {
        assertEquals("Kotlin", MyLibrary().kotlinLanguage().name)
        assertEquals(10, MyLibrary().kotlinLanguage().hotness)
    }
}
