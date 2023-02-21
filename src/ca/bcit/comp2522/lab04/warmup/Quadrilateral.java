package ca.bcit.comp2522.lab04.warmup;

/**
 * Represents a quadrilateral shape.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class Quadrilateral {
    private Point topLeft;
    private Point topRight;
    private Point bottomLeft;
    private Point bottomRight;
    /**
     * The Quadrilateral constructor is a public method that creates a new Quadrilateral object.
     *
     * @param topLeft - the top-left corner point of the quadrilateral.
     * @param topRight - the top-right corner point of the quadrilateral.
     * @param bottomLeft - the bottom-left corner point of the quadrilateral.
     * @param bottomRight - the bottom-right corner point of the quadrilateral.
     */
    public Quadrilateral(
            final Point topLeft,
            final Point topRight,
            final Point bottomLeft,
            final Point bottomRight) {
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    /**
     * Prints a description of the quadrilateral to the console.
     */
    public void describe() {
        System.out.println("This is a quadrilateral.");
    }
}
