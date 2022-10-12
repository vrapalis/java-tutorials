package www.vrapalis.com.datastructures.stack;

public class StackUnderflowException extends RuntimeException {
    public StackUnderflowException() {
        super("Stack underflow exception");
    }
}
