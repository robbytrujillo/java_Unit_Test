package programmer.zaman.now.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test untuk Calkulator Class")
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    @DisplayName("Test sekenario sukses untuk method add(integer, integer)")
    public void testAddSuccess() {
        var result = calculator.add(10, 10);
//        var result = Calculator.add(10, 10);
        assertEquals(20, result);
//        if(result != 20) {
//            throw new RuntimeException("Test gagal");
//        }

    }
    @Test
    public void testDivideSuccess() {
        var result = calculator.divide(100, 10);
        assertEquals(10, result);
    }

    public void testDivideFailed() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        }) ;
   }
}
