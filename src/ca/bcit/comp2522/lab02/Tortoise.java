package ca.bcit.comp2522.lab02;
import java.util.Objects;
import java.util.Random;

/**
 Represent the Tortoise object.
 @author Amir Eskandari
 @version 1.0
 */
public class Tortoise {

    private int position;
    private Random rand;

    /**
     * Constructs a Tortoise object with a starting position of 0 and a random number generator.
     */
    public Tortoise() {
        position = 0;
        rand = new Random();
    }

    /**
     * Move the Tortoise object using random numbers to determine the distance and direction.
     *
     * @return the Tortoise object's updated position in integer
     */
    public int move() {
        double moveChance = rand.nextDouble();
        if (moveChance <= 0.75) {
            position += 2; // 75% chance of steady plod
        } else if (moveChance <= 0.95) {
            position -= 1; // 20% chance of slip
        } else {
            position += 1; // 5% chance of slow plod
        }
        return position;
    }

    /**
     * Get the Tortoise object's current position.
     *
     * @return Tortoise object's current position in integer.
     */
    public int getPosition() {
        return position;
    }

    /**
     * Set the Tortoise object's current position.
     *
     * @param position the new position in integer
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * Return the Tortoise object's current position as a string.
     *
     * @return a string representation of the Tortoise's current position
     */
    @Override
    public String toString() {
        return "Tortoise's current position: " + position;
    }

    /**
     * Determines if Tortoise object is equal to the object instance.
     *
     * @param o the object to compare
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tortoise tortoise = (Tortoise) o;
        return position == tortoise.position && Objects.equals(rand, tortoise.rand);
    }


    /**
     Generates a hash code for this Tortoise based on its position and random number generator.

     @return the Tortoise's position and random number generator as its hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(position, rand);
    }
}
