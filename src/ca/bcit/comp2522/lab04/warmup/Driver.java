package ca.bcit.comp2522.lab04.warmup;

/**
 * Driver is a class that demonstrates the use of the Quadrilateral, Parallelogram,
 * Rectangle, and Square classes.
 * @author Amir Eskandari
 * @version 1.0
 */
public class Driver {
    /**
     * The main method that creates instances of the Quadrilateral, Parallelogram,
     * Rectangle, and Square classes, and calls their describe methods.
     *
     * @param args - command line arguments (not used).
     */
    public static void main(final String[] args) {
        Quadrilateral quadrilateral = new Quadrilateral();
        quadrilateral.describe();

        Quadrilateral parallelogram = new Parallelogram();
        parallelogram.describe();

        Quadrilateral rectangle = new Rectangle();
        rectangle.describe();

        Quadrilateral square = new Square();
        square.describe();
    }
}
