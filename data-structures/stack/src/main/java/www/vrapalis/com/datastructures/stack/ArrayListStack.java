package www.vrapalis.com.datastructures.stack;

import java.util.ArrayList;

/**
 * Array list implementation of the stack
 *
 * @param <T>
 */
public class ArrayListStack<T> implements Stack<T> {

    private ArrayList<T> items;

    public ArrayListStack() {
        this.items = new ArrayList<>();
    }

    @Override
    public void push(T item) {
        if (isFull()) {
            throw new StackOverflowException();
        }
        items.add(item);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        return items.remove(items.size() - 1);
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return items.size() == 0;
    }

    @Override
    public int length() {
        return items.size();
    }
}
