package ca.bcit.comp2522.lab06;

/**
 * The NotAnIntegerException represent an exception that occurs when the user enters a non-integer value.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class NotAnIntegerException extends Exception {
    /**
     * Constructs a NotAnIntegerException object with the specified error message.
     *
     * @param message the error message for the exception
     */
    public NotAnIntegerException(String message) {
        super(message);
    }
}
