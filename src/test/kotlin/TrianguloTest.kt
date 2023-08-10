import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TriangleTest {
    @Test
    fun testDrawTriangleLevel1() {
        val expected = "*\n"
        val result = drawTriangle(1)
        assertEquals(expected, result)
    }

    @Test
    fun testDrawTriangleLevel3() {
        val expected = "  *\n ***\n*****\n"
        val result = drawTriangle(3)
        assertEquals(expected, result)
    }

    @Test
    fun testDrawTriangleLevel5() {
        val expected = "    *\n   ***\n  *****\n *******\n*********\n"
        val result = drawTriangle(5)
        assertEquals(expected, result)
    }

    @Test
    fun testDrawTriangleLevel0() {  //cadena vacia
        val expected = ""
        val result = drawTriangle(0)
        assertEquals(expected, result)
    }

    @Test
    fun testDrawTriangleNegativeLevel() {
        val expected = ""
        val result = drawTriangle(-5)
        assertEquals(expected, result)
    }
}