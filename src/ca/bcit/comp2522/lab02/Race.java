package ca.bcit.comp2522.lab02;

import java.util.Random;

/**

 Represents a Race between a Tortoise and a Hare.
 @author Amir Eskandari
 @version 1.0
 */
public class Race {

    private int distance;
    private Tortoise tortoise;
    private Hare hare;
    private Random rand;

    /**
     * Creates a Race object with a given distance, a Tortoise object and a Hare object.
     * @param distance the distance of the race in integer
     * @param tortoise the Tortoise object in the race
     * @param hare the Hare object in the race
     */
    public Race(int distance, Tortoise tortoise, Hare hare) {
        this.distance = distance;
        this.tortoise = tortoise;
        this.hare = hare;
        rand = new Random();
    }


    /**
     * Sets the starting position of the Tortoise and Hare to 0.
     */
    private void onYourMark() {
        tortoise.setPosition(0);
        hare.setPosition(0);
    }

    /**
     * Simulates the race between the Tortoise and Hare.
     * @return the name of the winner as a string
     */
    public String simulateRace() {
        onYourMark();
        return race();
    }

    /**
     * Runs the race by moving the Tortoise and Hare until one of them reaches the finish line.
     * @return the name of the winner as a string
     */
    private String race() {
        do {
            if (rand.nextBoolean()) {
                tortoise.move();
                if (tortoise.getPosition() > distance) {
                    break;
                }
                hare.move();
            } else {
                hare.move();
                if (hare.getPosition() > distance) {
                    break;
                }
                tortoise.move();
            }
        } while (tortoise.getPosition() < distance && hare.getPosition() < distance);

        if (tortoise.getPosition() > hare.getPosition()) {
            return "Tortoise";
        } else {
            return "Hare";
        }
    }
}
