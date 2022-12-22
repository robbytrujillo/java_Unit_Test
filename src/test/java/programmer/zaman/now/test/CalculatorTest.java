package programmer.zaman.now.test;

import org.junit.jupiter.api.*;
import programmer.zaman.now.test.generator.SimpleDisplayNameGenerator;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
//@DisplayName("Test untuk Calkulator Class")
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Before Each");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After Each");
    }

    @Test
    //@DisplayName("Test sekenario sukses untuk method add(integer, integer)")
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

    @Test
    @Disabled
   public void testCommingSoon() {

   }
}
