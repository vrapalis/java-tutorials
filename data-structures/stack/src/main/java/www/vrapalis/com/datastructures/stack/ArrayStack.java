package www.vrapalis.com.datastructures.stack;

import java.util.Arrays;

/**
 * Array bound implementation of stack interface
 *
 * @param <T>
 */
public class ArrayStack<T> implements Stack<T> {
    private int topIndex = -1;
    private final T[] items;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        items = (T[]) new Object[DEFAULT_LENGTH];
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int stackLength) {
        items = (T[]) new Object[stackLength];
    }

    @Override
    public void push(T item) {
        if (isFull()) {
            throw new StackOverflowException();
        }
        topIndex++;
        items[topIndex] = item;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        T item = items[topIndex];
        items[topIndex] = null;
        topIndex--;
        return item;
    }

    @Override
    public boolean isFull() {
        return (topIndex == (items.length - 1));
    }

    @Override
    public boolean isEmpty() {
        return (topIndex == -1);
    }

    @Override
    public int length() {
        return items.length;
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}
