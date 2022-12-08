package www.vrapalis.com.testing.junit5;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class ExampleExtension implements BeforeAllCallback, AfterAllCallback {
    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        System.out.println("Before all callback ...");
    }

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        System.out.println("After all callback ...");
    }
}
