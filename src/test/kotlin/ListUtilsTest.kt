import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ListUtilsTest {

    // Test para el método ordenaslistass utilidades
    @Test
    fun testOrdenasListas() {
        val listUtils = ListUtils()

        // Listas de entrada
        val lista1 = listOf(300, 100, 400)
        val lista2 = listOf(200, 1000)

        // Llamada al método a testear
        val resultado = listUtils.ordenaslistass(lista1, lista2)

        // Resultado esperado
        val resultadoEsperado = listOf(100, 200, 300, 400, 1000)

        // Comprobación del resultado
        assertEquals(resultadoEsperado, resultado)
    }
}
