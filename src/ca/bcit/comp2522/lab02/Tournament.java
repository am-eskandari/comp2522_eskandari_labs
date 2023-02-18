package ca.bcit.comp2522.lab02;

/**
 Runs a tournament of races between a Tortoise and a Hare.
 @author Amir Eskandari
 @version 1.0
 */
public class Tournament {

    private Tournament() {
        // private constructor to prevent instantiation
    }

    /**
     * Drive the program.
     */
    public static void main(String[] args) {
        Tortoise tortoise = new Tortoise();
        Hare hare = new Hare();
        Race race = new Race(100, tortoise, hare);

        // Race the Tortoise and Hare a distance of 100 units and report the winner
        String winner = race.simulateRace();
        System.out.printf("In a race of 100 units, the %s won with a final position of %d. It took %d clock ticks.\n",
                winner, (winner.equals("Tortoise") ? tortoise.getPosition() : hare.getPosition()),
                (winner.equals("Tortoise") ? tortoise.getPosition() : hare.getPosition()));

        // Simulate 100 races of length 100
        String result1 = simulateRaces(100, 100);
        System.out.println(result1);

        // Simulate 100 races of length 1000
        String result2 = simulateRaces(100, 1000);
        System.out.println(result2);
    }

    /**
     * Simulate a number of races between a Tortoise and a Hare.
     *
     * @param numRaces the number of races to simulate in integer
     * @param distance the distance of each race in integer
     * @return a string summarizing the results of the races
     */
    public static String simulateRaces(int numRaces, int distance) {
        int tortoiseWins = 0;
        int hareWins = 0;

        for (int i = 0; i < numRaces; i++) {
            Tortoise tortoise = new Tortoise();
            Hare hare = new Hare();
            Race race = new Race(distance, tortoise, hare);
            String winner = race.simulateRace();
            if (winner.equals("Tortoise")) {
                tortoiseWins++;
            } else {
                hareWins++;
            }
        }
        return String.format("In %d races of %d units, the Tortoise won %d times and the Hare won %d times.\n",
                numRaces, distance, tortoiseWins, hareWins);
    }
}
