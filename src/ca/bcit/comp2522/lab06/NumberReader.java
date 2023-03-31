package ca.bcit.comp2522.lab06;

/**
 * The NumberReader class is used to read integers from the console and calculate their sum.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class NumberReader {

    private final InputReader inputReader;
    /**
     * Constructs a NumberReader object with an InputReader object.
     */
    public NumberReader() {
        inputReader = new InputReader();
    }
    /**
     * Prompts the user to enter integers and calculates their sum.
     */
    public void guessNumber() {
        int sum = 0;
        while (true) {
            System.out.print("Enter an integer, 0 to stop: ");
            try {
                int num = inputReader.getNumber();
                if (num == 0) {
                    break;
                }
                sum += num;
            } catch (NotAnIntegerException e) {
                System.out.println("Invalid entry -- " + e.getMessage());
            }
        }
        System.out.println("The sum of numbers entered is " + sum);
    }
    /**
     * The main method creates a NumberReader object and calls its guessNumber method.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        NumberReader numberReader = new NumberReader();
        numberReader.guessNumber();
    }
}
