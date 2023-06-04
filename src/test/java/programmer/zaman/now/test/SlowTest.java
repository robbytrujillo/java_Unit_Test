package programmer.zaman.now.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class SlowTest {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testSlow() throws InterruptedException{
        // jika unit testnya terlalu lama maka akan gagal eksekusinya
        Thread.sleep(10_000);
    }
}
