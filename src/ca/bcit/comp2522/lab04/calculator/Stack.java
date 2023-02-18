package ca.bcit.comp2522.lab04.calculator;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;

public class Stack {
    private final int[] stackValues;
    private int count;

    public Stack(final int size) {
        if (size <= 1) {
            throw new IllegalArgumentException("Size must be greater than 1");
        }
        stackValues = new int[size];
        count = 0;
    }

    public int capacity() {
        return stackValues.length;
    }

    public int size() {
        return count;
    }

    public int unused() {
        return stackValues.length - count;
    }

    public void push(final int value) {
        if (count >= stackValues.length) {
            throw new BufferOverflowException();
        }
        stackValues[count++] = value;
    }

    public int pop() {
        if (count <= 0) {
            throw new BufferUnderflowException();
        }
        return stackValues[--count];
    }

    public int peek() {
        if (count <= 0) {
            throw new BufferUnderflowException();
        }
        return stackValues[count - 1];
    }
}
