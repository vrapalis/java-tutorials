package www.vrapalis.com.testing.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ExampleExtension.class)
public class ExampleExtensionTest {

    @Test
    void test() {
        System.out.println("Test running ...");
    }
}
