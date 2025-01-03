// Java code​​​​​​‌‌​​​‌‌​​‌‌‌‌‌​​‌‌​‌‌​​​​ below
// Write your answer here, and then test your code.

import static org.junit.jupiter.api.Assertions.assertEquals;

class Answer {

    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

}

class CalculatorTest {

    //We add @Test to make this work
    @Test  
    void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 4);
        assertEquals(7, result);
    }
}


// Starter code for Calculator class
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

}
