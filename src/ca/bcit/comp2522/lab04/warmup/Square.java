package ca.bcit.comp2522.lab04.warmup;

/**
 * Represents a square shape.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class Square extends Rectangle {
    private double side;

    /**
     * Prints a description of the square to the console.
     */
    @Override
    public void describe() {
        System.out.println("This is a square.");
    }
}
