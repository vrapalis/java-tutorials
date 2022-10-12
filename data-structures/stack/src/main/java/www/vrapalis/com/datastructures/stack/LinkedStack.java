package www.vrapalis.com.datastructures.stack;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Linked implementation of the stack
 *
 * @param <T>
 */
@Getter
@NoArgsConstructor
public class LinkedStack<T> implements Stack<T> {
    private StackItem<T> top = new StackItem<>(null);

    @Override
    public void push(T item) {
        if (isFull()) {
            throw new StackOverflowException();
        }
        StackItem<T> newStackItem = new StackItem<>(item);
        newStackItem.setLink(top);
        top = newStackItem;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        StackItem<T> exTop = top;
        StackItem<T> previousStackItem = top.getLink();
        top = previousStackItem;
        return exTop.getValue();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return top.getLink() == null;
    }

    @Override
    public int length() {
        int count = 0;
        while (top.getLink() != null) {
            count++;
            StackItem<T> previousStackItem = top.getLink();
            top = previousStackItem;
        }
        return count;
    }

    @Override
    public String toString() {
        return "LinkedStack{" +
                "top=" + top +
                '}';
    }
}
