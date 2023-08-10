class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        if (b == 0) {
            throw IllegalArgumentException("No se puede dividir por cero")
        }
        return a / b
    }

}


//ordenamiento

class ListOperations {
    fun findMax(list: List<Int>): Int? {
        return list.maxOrNull()
    }

    fun isListSorted(list: List<Int>): Boolean {
        return list == list.sorted()
    }
}


class ListSorter {
    fun sortList(list: List<Int>): List<Int> {
        return list.sorted()
    }
}


class ListaNumeros { //permita almacenar una lista de números enteros y realizar algunas operaciones básicas con ellos.
    private val numeros = mutableListOf<Int>()

    fun agregarNumero(numero: Int) {
        numeros.add(numero)
    }

    fun obtenerNumeros(): List<Int> {
        return numeros.toList()
    }

    fun calcularSuma(): Int {
        return numeros.sum()
    }

    fun calcularPromedio(): Double {
        return if (numeros.isNotEmpty()) {
            numeros.average()
        } else {
            0.0
        }
    }
}

// Clase que contiene el método a testear
class ListUtils {
    fun ordenaslistass(lista1: List<Int>, lista2: List<Int>): List<Int> {
        val mergedList = mutableListOf<Int>()
        mergedList.addAll(lista1)
        mergedList.addAll(lista2)
        return mergedList.sorted()
    }
}


//palindrome

class PalindromeChecker {
    fun isPalindrome(word: String): Boolean {
        val cleanedWord = word.trim().toLowerCase()
        return cleanedWord == cleanedWord.reversed()
    }
}


// Método para dibujar un triángulo de 5 niveles de asteriscos
fun drawTriangle(levels: Int): String {
    val stringBuilder = StringBuilder()

    for (i in 1.rangeTo(levels)) {
        // Agregar espacios en blanco para alinear correctamente los asteriscos
        stringBuilder.append(" ".repeat(levels - i))

        // Agregar los asteriscos correspondientes a cada nivel
        stringBuilder.append(" ".repeat(i * 2 - 1))

        // Agregar salto de línea para pasar al siguiente nivel
        stringBuilder.append("\n")
    }

    return stringBuilder.toString()
}



// Método para verificar si un número es capicúa
fun isPalindromeNumber(number: Int): Boolean {
    val numStr = number.toString()
    val reversedNumStr = numStr.reversed()
    return numStr == reversedNumStr
}


fun searchNumber(list: List<Int>, target: Int): Boolean {
    return target in list
}



