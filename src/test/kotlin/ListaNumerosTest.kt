import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ListaNumerosTest {
    private lateinit var listaNumeros: ListaNumeros

    @BeforeEach
    fun setUp() {
        listaNumeros = ListaNumeros()
    }

    @Test
    fun testAgregarNumero() {
        listaNumeros.agregarNumero(5)
        listaNumeros.agregarNumero(10)
        listaNumeros.agregarNumero(15)

        assertEquals(listOf(5, 10, 15), listaNumeros.obtenerNumeros())
    }

    @Test
    fun testCalcularSuma() {
        listaNumeros.agregarNumero(5)
        listaNumeros.agregarNumero(10)
        listaNumeros.agregarNumero(15)

        assertEquals(30, listaNumeros.calcularSuma())
    }

    @Test
    fun testCalcularPromedio() {
        listaNumeros.agregarNumero(5)
        listaNumeros.agregarNumero(10)
        listaNumeros.agregarNumero(15)

        assertEquals(10.0, listaNumeros.calcularPromedio())
    }

    @Test
    fun testCalcularPromedioListaVacia() {
        assertEquals(0.0, listaNumeros.calcularPromedio())
    }
}