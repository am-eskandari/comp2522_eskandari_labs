package ca.bcit.comp2522.lab05;

import java.util.*;

/**
 * ArraySet class is an implementation of Set interface that uses an array to store its elements.
 *
 * @param <E> the type of elements in the set.
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
     * Constructs an empty ArraySet with an initial capacity of 10.
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
     * Returns true if this set contains no elements.
     *
     * @return true if this set contains no elements.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns true if this set contains the specified element.
     *
     * @param o the element to be checked for containment in this set.
     * @return true if this set contains the specified element.
     */
    public boolean contains(final Object o) {
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

        /**
         * Returns true if the iteration has more elements.
         *
         * @return true if the iteration has more elements.
         */
        public boolean hasNext() {
            return currentIndex < size;
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration.
         * @throws NoSuchElementException if the iteration has no more elements.
         */
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return elements[currentIndex++];
        }

        /**
         * Removes from the underlying collection the last element returned by this iterator.
         *
         * @throws UnsupportedOperationException always thrown by this implementation of iterator.
         */
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * Returns an array containing all elements in this set.
     *
     * @return an array containing all elements in this set.
     */
    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

    /**
     * Returns an array containing all elements in this set.
     *
     * @param <T> the type of the array elements.
     * @param a   the array into which the elements of this set are to be stored
     * @return an array containing all elements in this set.
     * @throws ArrayStoreException  if the runtime type of the specified array is not a supertype of the runtime
     *                              type of every element in this set.
     * @throws NullPointerException if the specified array is null.
     */
    public <T> T[] toArray(final T[] a) {
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
     * @return true if this set did not already contain the specified element.
     */
    public boolean add(final E e) {
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
     * @param o the element to be removed from this set, if present.
     * @return true if the set contained the specified element.
     */
    public boolean remove(final Object o) {
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
     * Returns true if this set contains all elements of the specified collection.
     *
     * @param c collection to be checked for containment in this set.
     * @return true if this set contains all elements of the specified collection.
     */
    public boolean containsAll(final Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Adds all elements in the specified collection to this set if they're not already present.
     *
     * @param c collection containing elements to be added to this set.
     * @return true if this set changed as a result of the call.
     */
    public boolean addAll(final Collection<? extends E> c) {
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
     * In other words, removes from this set all of its elements that are not contained in the specified collection.
     *
     * @param c collection containing elements to be retained in this set.
     * @return true if this set changed as a result of the call.
     */
    public boolean retainAll(final Collection<?> c) {
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
     * Removes from this set all of its elements that are contained in the specified collection.
     *
     * @param c collection containing elements to be removed from this set.
     * @return true if this set changed as a result of the call.
     */
    public boolean removeAll(final Collection<?> c) {
        boolean modified = false;
        for (Object o : c) {
            modified |= remove(o);
        }
        return modified;
    }

    /**
     * Removes all elements from this set.
     */
    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
    }
}
