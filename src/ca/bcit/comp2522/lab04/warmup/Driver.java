package ca.bcit.comp2522.lab04.warmup;

public class Driver {
    public static void main(String[] args) {
        Quadrilateral quadrilateral = new Quadrilateral();
        quadrilateral.describe();

        Parallelogram parallelogram = new Parallelogram();
        parallelogram.describe();

        Rectangle rectangle = new Rectangle();
        rectangle.describe();

        Square square = new Square();
        square.describe();
    }
}
