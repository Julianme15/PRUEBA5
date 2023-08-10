import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class PalindromeTest {
    // Pruebas que arrojar verdadero (números capicúa)
    @Test
    fun testIsPalindromeNumber1() {
        assertTrue(isPalindromeNumber(121))
    }

    @Test
    fun testIsPalindromeNumber2() {
        assertTrue(isPalindromeNumber(12321))
    }

    @Test
    fun testIsPalindromeNumber3() {
        assertTrue(isPalindromeNumber(1001))
    }

    @Test
    fun testIsPalindromeNumber4() {
        assertTrue(isPalindromeNumber(55555))
    }

    @Test
    fun testIsPalindromeNumber5() {
        assertTrue(isPalindromeNumber(9876789))
    }


    // Pruebas que arrojar falso (números no capicúa)
    @Test
    fun testIsNotPalindromeNumber1() {
        assertFalse(isPalindromeNumber(123))
    }

    @Test
    fun testIsNotPalindromeNumber2() {
        assertFalse(isPalindromeNumber(12345))
    }

    @Test
    fun testIsNotPalindromeNumber3() {
        assertFalse(isPalindromeNumber(987654321))
    }

    @Test
    fun testIsNotPalindromeNumber4() {
        assertFalse(isPalindromeNumber(123456789))
    }

    @Test
    fun testIsNotPalindromeNumber5() {
        assertFalse(isPalindromeNumber(10001))
    }
}

