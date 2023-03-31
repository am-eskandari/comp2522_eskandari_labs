package ca.bcit.comp2522.lab07;

import java.util.NoSuchElementException;

/**
 * Doubly Linked List data structure.
 *
 * @param <E> the type of elements in this list
 * @version 1.0
 * @author Amir Eskandari
 */
public class DoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    /**
     * Constructs an empty DoublyLinkedList.
     */
    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Returns the number of elements in the list.
     *
     * @return the number of elements in the list
     */
    public int size() {
        return size;
    }

    /**
     * Removes all of the elements from the list.
     */
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Inserts the specified element at the beginning of this list.
     *
     * @param data the element to add
     */
    public void prepend(final E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    /**
     * Appends the specified element to the end of this list.
     *
     * @param data the element to add
     */
    public void append(final E data) {
        Node<E> newNode = new Node<>(data);
        if (tail == null) {
            head = newNode;
        } else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }

    /**
     * Inserts the specified element at the specified position in this list.
     *
     * @param data the element to add
     * @param index the index at which the specified element is to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     *                                   (index < 0 || index > size())
     */
    public void add(final E data, final int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            prepend(data);
        } else if (index == size) {
            append(data);
        } else {
            Node<E> newNode = new Node<>(data);
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            newNode.setPrev(current);
            newNode.setNext(current.getNext());
            current.getNext().setPrev(newNode);
            current.setNext(newNode);
            size++;
        }
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index the index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *                                   (index < 0 || index >= size())
     */
    public Object get(final int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        } else {
            Node<E> current = this.head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current.getData();
        }
    }

    /**
     * Remove the node at the specified index from this DoublyLinkedList.
     *
     * @param index the index of the node to remove
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public void remove(final int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            this.removeFirst();
        } else if (index == this.size - 1) {
            this.removeLast();
        } else {
            Node<E> current = this.head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());
            this.size--;
        }
    }

    /**
     * Remove the first node from this DoublyLinkedList.
     *
     * @throws NoSuchElementException if the list is empty
     */
    public void removeFirst() {
        if (this.head == null) {
            throw new NoSuchElementException();
        } else {
            this.head = this.head.getNext();
            if (this.head == null) {
                this.tail = null;
            } else {
                this.head.setPrev(null);
            }
            this.size--;
        }
    }

    /**
     * Remove the last node from this DoublyLinkedList.
     *
     * @throws NoSuchElementException if the list is empty
     */
    public void removeLast() {
        if (this.tail == null) {
            throw new NoSuchElementException();
        } else {
            this.tail = this.tail.getPrev();
            if (this.tail == null) {
                this.head = null;
            } else {
                this.tail.setNext(null);
            }
            this.size--;
        }
    }

    /**
     * Convert this DoublyLinkedList to a String representation.
     *
     * @return the String representation of this DoublyLinkedList
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> current = this.head;
        while (current != null) {
            sb.append(current.getData());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
