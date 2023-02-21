package ca.bcit.comp2522.lab04.warmup;

/**
 * Represents a parallelogram shape.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class Parallelogram extends Quadrilateral {
    private double sideLength;
    /**
     * Constructs a new Parallelogram.
     *
     * @param topLeft - the top-left corner point of the parallelogram.
     * @param bottomLeft - the bottom-left corner point of the parallelogram.
     * @param sideLength - the length of the sides of the parallelogram.
     */
    public Parallelogram(
            final Point topLeft,
            final Point bottomLeft,
            final double sideLength) {
        super(
                topLeft,
                new Point(topLeft.getX() + sideLength, topLeft.getY()),
                bottomLeft,
                new Point(bottomLeft.getX() + sideLength, bottomLeft.getY())
        );
        this.sideLength = sideLength;
    }

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
