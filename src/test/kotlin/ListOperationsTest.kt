import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class ListOperationsTest {

    @Test
    fun testFindMax() {  //Buscar el mayor
        val listOperations = ListOperations()

        assertEquals(10, listOperations.findMax(listOf(2, 4, 6, 8, 10)))
        assertEquals(100, listOperations.findMax(listOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)))
        assertEquals(-1, listOperations.findMax(listOf(-1, -5, -10, -2, -3)))
        assertEquals(null, listOperations.findMax(emptyList()))
    }


    @Test
    fun testIsListSorted() {
        val listOperations = ListOperations()  //comprobar que sea una lista ordenada

        assertTrue(listOperations.isListSorted(listOf(1, 2, 3, 4, 5)))
        assertTrue(listOperations.isListSorted(listOf(10, 20, 30, 40, 50)))
        assertFalse(listOperations.isListSorted(listOf(5, 4, 3, 2, 1)))
        assertTrue(listOperations.isListSorted(emptyList()))
    }
}

class ListSorterTest { //  en  este caso de prueba, cree un objeto ListSorter,
    // luego le paso una lista desordenada a sortList, y finalmente,
    // se compara el resultado con la lista ordenada esperada utilizando
    // assertEquals. Si la lista generada por el método es igual a la lista
    // ordenada esperada, el caso de prueba pasará con éxito.

    @Test
    fun testSortList() {
        val listSorter = ListSorter()

        val unsortedList = listOf(5, 2, 8, 1, 10, 3) //(6, 2, 8, 1, 10, 3)
        val sortedList = listSorter.sortList(unsortedList)

        assertEquals(listOf(1, 2, 3, 5, 8, 10), sortedList)
    }
}
