import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        //Arrange
        calculator = new Calculator();
    }

    @Test
    public void adding1Plus1Is2() {
        // Arrange
        int operand1 = 1;
        int operand2 = 1;
        int expected = 2;

        // Act
        int actual = calculator.add(operand1, operand2);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void subtraction2Minus1Is1() {
        // Arrange
        int operand1 = 2;
        int operand2 = 1;
        int expected = 1;

        // Act
        int actual = calculator.sub(operand1, operand2);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void multiplication2Multi2Is4() {
        // Arrange
        int operand1 = 2;
        int operand2 = 2;
        int expected = 4;

        // Act
        int actual = calculator.mul(operand1, operand2);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void division2Div2Is1() {
        // Arrange
        int operand1 = 2;
        int operand2 = 2;
        int expected = 1;

        // Act
        int actual = calculator.div(operand1, operand2);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Division by zero should throw an ArithmeticException")
    void divideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.div(1, 0));
        assertEquals("/ by zero", exception.getMessage());
    }

}
