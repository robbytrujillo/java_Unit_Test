package programmer.zaman.now.test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import programmer.zaman.now.test.resolver.RandomParameterResolver;

import java.util.Random;


public class RandomCalculatorTest extends AbstractCalculatorTest {


    @Test
    void testRandom(TestInfo info, Random random) {
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expected = a + b;

        Assertions.assertEquals(expected, result);

        }
}

