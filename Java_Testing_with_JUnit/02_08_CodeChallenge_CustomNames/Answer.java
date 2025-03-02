// Java code​​​​​​‌‌​​‌​​‌​​‌​​‌​‌‌‌‌​‌​‌​‌ below
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

}

class CalculatorTest {

    @Test
    @DisplayName("Test Addition with positive numbers")
    void testAdditionWithPositiveNumbers() {
        Calculator calculator = new Calculator();

        int result = calculator.add(5, 3);

        // Assert that the addition operation is correct
        assertEquals(8, result, "5 + 3 should equal 8");
    }

    @Test
    @DisplayName("Test substraction with negative numbers")
    void testSubtractionWithNegativeNumbers() {
        Calculator calculator = new Calculator();

        int result = calculator.subtract(-5, -3);

        // Assert that the subtraction operation is correct
        assertEquals(-2, result, "-5 - (-3) should equal -2");
    }
}


// Starter code for Calculator class
class Calculator {

    int add(int a, int b) {
        return a + b;
    }
    int subtract(int a, int b) {
        return a - b;
    }
}
