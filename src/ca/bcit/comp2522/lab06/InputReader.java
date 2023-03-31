package ca.bcit.comp2522.lab06;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The InputReader class is used to read user input from the console.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class InputReader {
    private final Scanner scanner;
    /**
     * Constructs an InputReader object.
     */
    public InputReader() {
        scanner = new Scanner(System.in);
    }
    /**
     * Reads an integer from the console.
     *
     * @return an integer value entered by the user
     * @throws NotAnIntegerException if the user enters a non-integer value
     */
    public int getNumber() throws NotAnIntegerException {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw new NotAnIntegerException("That's not an integer!");
        }
    }
}
