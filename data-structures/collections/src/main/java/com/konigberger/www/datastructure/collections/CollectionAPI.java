package com.konigberger.www.datastructure.collections;

public interface CollectionAPI<T> {

    boolean isFull();

    boolean isEmpty();

    T get(T element);

    boolean add(T element);

    boolean remove(T element);

    int size();
}