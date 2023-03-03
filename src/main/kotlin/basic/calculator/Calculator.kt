package design.patterns.basic.calculator

internal class Calculator {
    fun suma(numberA: Int, numberB: Int): String {
        val result = numberA + numberB

        return "La suma de $numberA + $numberB es $result"
    }

    fun resta(numberA: Int, numberB: Int): String {
        val result = numberA - numberB

        return "La resta de $numberA - $numberB es $result"
    }

    fun multiplicacion(numberA: Int, numberB: Int): String {
        val result = numberA * numberB

        return "La multiplicacion de $numberA * $numberB es $result"
    }

    fun division(numberA: Int, numberB: Int): String {
        val result = numberA / numberB

        return "La division de $numberA / $numberB es $result"
    }


}
