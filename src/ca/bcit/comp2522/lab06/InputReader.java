package ca.bcit.comp2522.lab06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputReader {
    private final Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

    public int getNumber() throws NotAnIntegerException {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw new NotAnIntegerException("That's not an integer!");
        }
    }
}