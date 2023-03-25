package ca.bcit.comp2522.lab05;

import java.util.*;

/**
 * ArraySet - A custom implementation of a Set using an array to store elements.
 *
 * @param <E> the type of elements in this set
 * @author Amir Eskandari
 * @version 1.0
 */
public class ArraySet<E> implements Set<E>, Iterable<E> {
    /**
     * The maximum capacity of the array.
     */
    private int capacity;
    /**
     * The current number of elements in the set.
     */
    private int size;
    /**
     * The array that holds the elements.
     */
    private E[] elements;

    /**
     * Constructs a new ArraySet with an initial capacity of 10.
     */
    public ArraySet() {
        capacity = 10;
        size = 0;
        elements = (E[]) new Object[capacity];
    }

    /**
     * Returns the number of elements in this set.
     *
     * @return the number of elements in this set.
     */
    public int size() {
        return size;
    }

    /**
     * Returns whether this set is empty.
     *
     * @return true if this set contains no elements, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns whether this set contains the specified element.
     *
     * @param o the object to be checked for containment in this set.
     * @return true if this set contains the specified element, false otherwise.
     */
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(o, elements[i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns an iterator over the elements in this set.
     *
     * @return an iterator over the elements in this set.
     */
    public Iterator<E> iterator() {
        return new ArraySetIterator();
    }

    private class ArraySetIterator implements Iterator<E> {

        private int currentIndex = 0;

        public boolean hasNext() {
            return currentIndex < size;
        }

        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return elements[currentIndex++];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * Returns an array containing all of the elements in this set.
     *
     * @return an array containing all of the elements in this set.
     */
    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

    /**
     * Returns an array containing all of the elements in this set.
     *
     * @param a   the array into which the elements of this set are to be stored.
     * @param <T> the type of the array.
     * @return an array containing all of the elements in this set.
     */
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            return (T[]) Arrays.copyOf(elements, size, a.getClass());
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }

    /**
     * Adds the specified element to this set if it is not already present.
     *
     * @param e the element to be added to this set.
     * @return true if this set did not already contain the specified element, false otherwise.
     */
    public boolean add(E e) {
        if (contains(e)) {
            return false;
        }
        if (size == capacity) {
            capacity *= 2;
            elements = Arrays.copyOf(elements, capacity);
        }
        elements[size++] = e;
        return true;
    }

    /**
     * Removes the specified element from this set if it is present.
     *
     * @param o the object to be removed from this set, if present.
     * @return true if this set contained the specified element, false otherwise.
     */
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(o, elements[i])) {
                elements[i] = elements[--size];
                elements[size] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * Returns whether this set contains all of the elements in the specified collection.
     *
     * @param c the collection to be checked for containment in this set.
     * @return true if this set contains all of the elements in the specified collection, false otherwise.
     */
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Adds all of the elements in the specified collection to this set if they are not already present.
     *
     * @param c the collection containing elements to be added to this set.
     * @return true if this set was modified as a result of the call, false otherwise.
     */
    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E e : c) {
            if (add(e)) {
                modified = true;
            }
        }
        return modified;
    }

    /**
     * Retains only the elements in this set that are contained in the specified collection.
     *
     * @param c the collection containing elements to be retained in this set.
     * @return true if this set was modified as a result of the call, false otherwise.
     */
    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        for (int i = 0; i < size; i++) {
            if (!c.contains(elements[i])) {
                remove(elements[i]);
                i--;
                modified = true;
            }
        }
        return modified;
    }

    /**
     * Removes all of the elements in the specified collection from this set if they are present.
     *
     * @param c the collection containing elements to be removed from this set.
     * @return true if this set was modified as a result of the call, false otherwise.
     */
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object o : c) {
            modified |= remove(o);
        }
        return modified;
    }

    /**
     * Removes all of the elements from this set.
     */
    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
    }
}
