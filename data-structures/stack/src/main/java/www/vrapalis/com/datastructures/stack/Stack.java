package www.vrapalis.com.datastructures.stack;

/**
 * Stack interface ADT (Abstract Data Type)
 * This interface describes the behavior of the stack
 *
 * @param <T>
 */
public interface Stack<T> {
    /**
     * Default length of the stack
     */
    int DEFAULT_LENGTH = 100;

    /**
     * Push item to the stack
     */
    void push(T item);

    /**
     * Remove and return item from the stack
     *
     * @return item
     */
    T pop();

    /**
     * Return true if stack is out of space, or false if stack has free place
     *
     * @return boolean
     */
    boolean isFull();

    /**
     * Return true if stack has no items, or return false if stack has items
     *
     * @return boolean
     */
    boolean isEmpty();

    /**
     * @return the length of the stack (how many items can be stored)
     */
    int length();
}
