package ca.bcit.comp2522.lab04.warmup;

public class Driver {
    public static void main(String[] args) {
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
