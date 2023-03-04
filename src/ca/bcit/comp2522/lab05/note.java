package ca.bcit.comp2522.lab05;

//public class note {
//}

import java.util.*;

public class ArraySet<E> implements Set<E>, Iterable<E> {

    private int capacity;
    private int size;
    private E[] elements;

    public ArraySet() {
        capacity = 10;
        size = 0;
        elements = (E[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(o, elements[i])) {
                return true;
            }
        }
        return false;
    }

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

    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

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

    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E e : c) {
            if (add(e)) {
                modified = true;
            }
        }
        return modified;
    }

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

    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object o : c) {
            modified |= remove(o);
        }
        return modified;
    }

    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
    }
}
