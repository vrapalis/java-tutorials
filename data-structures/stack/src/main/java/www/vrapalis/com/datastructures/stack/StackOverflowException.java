package www.vrapalis.com.datastructures.stack;

public class StackOverflowException extends RuntimeException {
    public StackOverflowException() {
        super("Stack overflow exception");
    }
}
