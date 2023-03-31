package ca.bcit.comp2522.lab07;

/**
 * Node class for a doubly linked list.
 *
 * @param <T> the type of data stored in the node
 * @version 1.0
 * @author Amir Eskandari
 */
public class Node<T> {
    private T data;
    private Node<T> prev;
    private Node<T> next;

    /**
     * Constructs a new node with the given data.
     *
     * @param data the data to store in the node
     */
    public Node(final T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    /**
     * Returns the data stored in the node.
     *
     * @return the data stored in the node
     */
    public T getData() {
        return this.data;
    }

    /**
     * Sets the data stored in the node.
     *
     * @param data the new data to store in the node
     */
    public void setData(final T data) {
        this.data = data;
    }

    /**
     * Returns the previous node in the list.
     *
     * @return the previous node in the list
     */
    public Node<T> getPrev() {
        return this.prev;
    }

    /**
     * Sets the previous node in the list.
     *
     * @param prev the new previous node in the list
     */
    public void setPrev(final Node<T> prev) {
        this.prev = prev;
    }

    /**
     * Returns the next node in the list.
     *
     * @return the next node in the list
     */
    public Node<T> getNext() {
        return this.next;
    }

    /**
     * Sets the next node in the list.
     *
     * @param next the new next node in the list
     */
    public void setNext(final Node<T> next) {
        this.next = next;
    }
}
