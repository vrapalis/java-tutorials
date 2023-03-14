package com.konigberger.www.datastructure.collections;

import java.util.Arrays;

public class ArrayBasedCollection<T> implements CollectionAPI<T> {

    private final int CAPACITY = 100;

    private int elPointer;

    private T[] elements;

    public ArrayBasedCollection() {
        elements = (T[]) new Object[CAPACITY];
    }

    public ArrayBasedCollection(int capacity) {
        elements = (T[]) new Object[capacity];
    }

    @Override
    public boolean isFull() {
        return elPointer == elements.length;
    }

    @Override
    public boolean isEmpty() {
        return elPointer == 0;
    }

    @Override
    public T get(T element) {
        return Arrays.stream(elements).filter(element::equals).findFirst().orElse(null);
    }

    @Override
    public boolean add(T element) {
        if (isFull()) {
            return false;
        }
        this.elements[elPointer++] = element;
        return true;
    }

    @Override
    public boolean remove(T element) {
        if (isEmpty()) {
            return false;
        }

        for (int i = 0; i < elements.length; i++) {
            T el = elements[i];
            if (el != null) {
                if (el.equals(element)) {
                    elements[i] = elements[elPointer - 1];
                    elements[elPointer-- - 1] = null;
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public int size() {
        return elPointer;
    }
}
