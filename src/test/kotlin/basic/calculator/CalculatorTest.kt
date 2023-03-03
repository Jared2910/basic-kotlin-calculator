package basic.calculator

import com.github.stefanbirkner.systemlambda.SystemLambda
import design.patterns.basic.calculator.Calculator
import design.patterns.observer.NewsletterDisplayListener
import design.patterns.observer.UniversityNewsletter
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class CalculatorTest {

    private val standardOut = System.out
    private val outputStreamCaptor = ByteArrayOutputStream()

    @BeforeEach
    fun setUp() {
        System.setOut(PrintStream(outputStreamCaptor))
    }

    @AfterEach
    fun tearDown() {
        System.setOut(standardOut)
    }

    @Test
    fun `It should display the result of adding 2 numbers `() {

        val calculator = Calculator()

        val output = calculator.suma(20,30)

        Assertions.assertEquals("La suma de 20 + 30 es 50", output.trim())
    }

    @Test
    fun `It should display the result of subtracting 2 numbers `() {

        val calculator = Calculator()

        val output = calculator.resta(20,30)

        Assertions.assertEquals("La resta de 20 - 30 es -10", output.trim())
    }

    @Test
    fun `It should display the result of multiplying 2 numbers `() {

        val calculator = Calculator()

        val output = calculator.multiplicacion(20,30)

        Assertions.assertEquals("La multiplicacion de 20 * 30 es 600", output.trim())
    }

    @Test
    fun `It should display the result of dividing 2 numbers `() {

        val calculator = Calculator()

        val output = calculator.division(20,30)

        Assertions.assertEquals("La division de 20 / 30 es 0", output.trim())
    }
}