import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SearchNumberTest {
    // Pruebas positivas
    @Test
    fun testSearchNumberPositive1() {
        val list = listOf(1, 2, 3, 4, 5)
        val target = 5
        assertTrue(searchNumber(list, target))
    }

    @Test
    fun testSearchNumberPositive2() {
        val list = listOf(10, 20, 30, 40, 50)
        val target = 20
        assertTrue(searchNumber(list, target))
    }

    @Test
    fun testSearchNumberPositive3() {
        val list = listOf(100, 200, 300, 400, 500)
        val target = 500
        assertTrue(searchNumber(list, target))
    }

    @Test
    fun testSearchNumberPositive4() {
        val list = listOf(-5, -4, -3, -2, -1)
        val target = -4
        assertTrue(searchNumber(list, target))
    }

    @Test
    fun testSearchNumberPositive5() {
        val list = listOf(2, 4, 6, 8, 10)
        val target = 6
        assertTrue(searchNumber(list, target))
    }

    // Pruebas negativas
    @Test
    fun testSearchNumberNegative1() {
        val list = listOf(1, 2, 3, 4, 5)
        val target = 6
        assertFalse(searchNumber(list, target))
    }

    @Test
    fun testSearchNumberNegative2() {
        val list = listOf(10, 20, 30, 40, 50)
        val target = 15
        assertFalse(searchNumber(list, target))
    }

    @Test
    fun testSearchNumberNegative3() {
        val list = listOf(100, 200, 300, 400, 500)
        val target = 1000
        assertFalse(searchNumber(list, target))
    }

    @Test
    fun testSearchNumberNegative4() {
        val list = listOf(-5, -4, -3, -2, -1)
        val target = -10
        assertFalse(searchNumber(list, target))
    }

    @Test
    fun testSearchNumberNegative5() {
        val list = listOf(2, 4, 6, 8, 10)
        val target = 11
        assertFalse(searchNumber(list, target))
    }
    // Pruebas con números negativos
    @Test
    fun testSearchNumberNegative6() {
        val list = listOf(-3, -2, -1, 0, 1)
        val target = 0
        assertTrue(searchNumber(list, target))
    }

    @Test
    fun testSearchNumberNegative7() {
        val list = listOf(-50, -40, -30, -20, -10)
        val target = -30
        assertTrue(searchNumber(list, target))
    }

    @Test
    fun testSearchNumberNegative8() {
        val list = listOf(-100, -200, -300, -400, -500)
        val target = -200
        assertTrue(searchNumber(list, target))
    }

    @Test
    fun testSearchNumberNegative9() {
        val list = listOf(-5, -4, -3, -2, -1)
        val target = -6
        assertFalse(searchNumber(list, target))
    }

    @Test
    fun testSearchNumberNegative10() {
        val list = listOf(-2, -4, -6, -8, -10)
        val target = -5
        assertFalse(searchNumber(list, target))
    }
}