package ca.bcit.comp2522.lab04.warmup;

/**
 * Represents a rectangle shape.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class Rectangle extends Parallelogram {
    private double length;
    private double height;
    /**
     * Constructs a new Rectangle with the specified length and height.
     *
     * @param length - the length of the rectangle.
     * @param height - the height of the rectangle.
     */
    public Rectangle(final double length, final double height) {
        super(new Point(0.0, height), new Point(0.0, 0.0), length);
        this.length = length;
        this.height = height;
    }

    /**
     * Prints a description of the rectangle to the console.
     */
    @Override
    public void describe() {
        System.out.println("This is a rectangle.");
    }
}
