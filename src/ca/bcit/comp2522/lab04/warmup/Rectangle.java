package ca.bcit.comp2522.lab04.warmup;

/**
 * Represents a rectangle shape.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class Rectangle extends Parallelogram {
    private double length;
    private double width;

    /**
     * Prints a description of the rectangle to the console.
     */
    @Override
    public void describe() {
        System.out.println("This is a rectangle.");
    }
}
