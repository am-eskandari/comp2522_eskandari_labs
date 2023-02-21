package ca.bcit.comp2522.lab04.warmup;

/**
 * Driver is a class that demonstrates the use of the Quadrilateral, Parallelogram,
 * Rectangle, and Square classes.
 *
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
        Quadrilateral quadrilateral = new Quadrilateral(
                new Point(0.0, 5.0),
                new Point(3.0, 5.0),
                new Point(3.0, 0.0),
                new Point(3.0, 2.0));
        quadrilateral.describe();

        Quadrilateral parallelogram = new Parallelogram(
                new Point(3.0, 2.0),
                new Point(0.0, 0.0),
                5.0
        );
        parallelogram.describe();

        Quadrilateral square = new Square(5.0);
        square.describe();

        Quadrilateral rectangle = new Rectangle(5.0, 10.0);
        rectangle.describe();
    }
}
