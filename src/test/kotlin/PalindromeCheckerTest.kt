import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class PalindromeCheckerTest {

    @Test
    fun testIsPalindrome() {
        val palindromeChecker = PalindromeChecker()


        assertTrue(palindromeChecker.isPalindrome("olo"))
        assertTrue(palindromeChecker.isPalindrome("solos"))
        assertTrue(palindromeChecker.isPalindrome("ana"))

        assertFalse(palindromeChecker.isPalindrome("uno"))
        assertFalse(palindromeChecker.isPalindrome("dos"))
        assertFalse(palindromeChecker.isPalindrome("tres"))


    }
}