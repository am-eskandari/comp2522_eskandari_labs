package ca.bcit.comp2522.lab04.warmup;

/**
 * Represents a parallelogram shape.
 * It extends the Quadrilateral class and adds two additional fields - base and height.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class Parallelogram extends Quadrilateral {
    private double base;
    private double height;

    /**
     * Prints a description of the parallelogram to the console.
     * Can be used by invoking describe method to any super/subclasses.
     *
     */
    @Override
    public void describe() {
        System.out.println("This is a parallelogram.");
    }
}
