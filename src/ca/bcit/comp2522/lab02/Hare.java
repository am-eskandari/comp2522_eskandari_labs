package ca.bcit.comp2522.lab02;

import java.util.Objects;
import java.util.Random;


/**
 * Represent the Hare object.
 *
 * @author Amir Eskandari
 * @version 1.0
 */

public class Hare {
    private int position;
    private Random rand;


    /**
     * Construct Hare object with a starting position of 0 and a random x.
     */
    public Hare() {
        position = 0;
        rand = new Random();
    }

    /**
     * Move the Hare object using random numbers to determine the distance and direction.
     *
     * @return the Hare object's updated position in integer
     */
    public int move() {
        double movePrompt = rand.nextDouble();
        if (movePrompt <= 0.5) {
            // 50% chance of loafing and brags
        } else if (movePrompt <= 0.75) {
            position += 4; // 25% chance of big hop
        } else if (movePrompt <= 0.8) {
            position -= 3; // 5% chance of big slip
        } else {
            position += 2; // 20% chance of small hop
        }
        return position;
    }

    /**
     * Get the Hare object's current position.
     *
     * @return Hare object's current position in integer.
     */
    public int getPosition() {
        return position;
    }

    /**
     * Set the Hare object's current position.
     *
     * @param position the new position in integer
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * Return the Hare object's current position as a string.
     *
     * @return a string representation of the Hare's current position
     */
    @Override
    public String toString() {
        return "Hare's current position: " + position;
    }

    /**
     * Determines if Hare object is equal to the object instance.
     *
     * @param o the object to compare
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hare hare = (Hare) o;
        return position == hare.position && Objects.equals(rand, hare.rand);
    }

    /**
     Generates a hash code for this Hare based on its position and random number generator.

     @return the Hare's position and random number generator as its hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(position, rand);
    }
}
