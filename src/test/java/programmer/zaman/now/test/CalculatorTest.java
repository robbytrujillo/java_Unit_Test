package programmer.zaman.now.test;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();
    @Test
    public void testAddSuccess() {
        var result = calculator.add(10, 10);
//        var result = Calculator.add(10, 10);
    }
}
