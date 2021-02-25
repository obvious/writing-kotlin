package `in`.obvious.ws.writingkotlin

import junit.framework.Assert.assertEquals
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun isValidEmail_isCorrect() {
        val result = StringUtil.isValidEmail("sharan@x.com")
        assertEquals(result, true)
    }
}