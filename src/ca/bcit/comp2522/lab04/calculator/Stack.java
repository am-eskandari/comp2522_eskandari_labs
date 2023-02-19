package ca.bcit.comp2522.lab04.calculator;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;

/**
 * Provides a simple stack data structure for integers.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class Stack {

    /**
     * The array used to store stack values.
     */
    private final int[] stackValues;

    /**
     * The number of values currently in the stack.
     */
    private int count;

    /**
     * Constructs a Stack with the specified size.
     *
     * @param size - the size of the stack to create.
     * @throws IllegalArgumentException - if the size is less than or equal to 1.
     */
    public Stack(final int size) {
        if (size <= 1) {
            throw new IllegalArgumentException("Size must be greater than 1");
        }
        stackValues = new int[size];
        count = 0;
    }

    /**
     * Returns the capacity of the stack, which is the maximum number of values it can hold.
     *
     * @return the capacity of the stack.
     */
    public int capacity() {
        return stackValues.length;
    }

    /**
     * Returns the number of values currently in the stack.
     *
     * @return the number of values in the stack.
     */
    public int size() {
        return count;
    }

    /**
     * Returns the number of unused slots in the stack.
     *
     * @return the number of unused slots in the stack.
     */
    public int unused() {
        return stackValues.length - count;
    }

    /**
     * Pushes the specified value onto the top of the stack.
     *
     * @param value - the value to push onto the stack.
     * @throws BufferOverflowException - if the stack is full.
     */
    public void push(final int value) {
        if (count >= stackValues.length) {
            throw new BufferOverflowException();
        }
        stackValues[count++] = value;
    }

    /**
     * Pops the top value off the stack, and returns it.
     *
     * @return the top value on the stack.
     * @throws BufferUnderflowException - if the stack is empty.
     */
    public int pop() {
        if (count <= 0) {
            throw new BufferUnderflowException();
        }
        return stackValues[--count];
    }

    /**
     * Returns the top value on the stack, without removing it.
     *
     * @return the top value on the stack.
     * @throws BufferUnderflowException - if the stack is empty.
     */
    public int peek() {
        if (count <= 0) {
            throw new BufferUnderflowException();
        }
        return stackValues[count - 1];
    }
}
