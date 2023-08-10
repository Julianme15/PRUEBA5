import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows
import java.awt.AWTEventMulticaster.add

class CalculatorTest {

    @Test
    fun testAddition() {
        val calculator = Calculator()
        assertEquals(12, calculator.add(5, 7))
        assertEquals(200, calculator.add(100, 100))
        assertEquals(0, calculator.add(0, 0))
    }
    @Test
    fun TestAddiitionNegativ(){
        val calculator = Calculator()
        assertEquals(-2, calculator.add(-5, 3))
        assertEquals(5, calculator.add(-5, 10))
        assertEquals(-2, calculator.add(-5, 3))
    }

    @Test
    fun testSubtraction() {
        val calculator = Calculator()
        assertEquals(7, calculator.subtract(10, 3))
        assertEquals(-8, calculator.subtract(5, 13))
        assertEquals(0, calculator.subtract(5, 5))
    }

    @Test
    fun testMultiplication() {
        val calculator = Calculator()
        assertEquals(24, calculator.multiply(4, 6))
        assertEquals(0, calculator.multiply(0, 10))
    }
    @Test
    fun testMultiplicationNegative(){
        val calculator = Calculator()
        assertEquals(-15, calculator.multiply(5, -3))
    }

    @Test
    fun testDivision() {
        val calculator = Calculator()
        assertEquals(4, calculator.divide(20, 5))
        assertEquals(3, calculator.divide(10, 3))
    }
    @Test
    fun testDivisionNegative(){
        val calculator = Calculator()
        assertEquals(-2, calculator.divide(-10, 5))
    }

    @Test
    fun testDivisionByZero() {
        val calculator = Calculator()
        assertThrows<IllegalArgumentException> {
            calculator.divide(10, 0)
        }
    }
}