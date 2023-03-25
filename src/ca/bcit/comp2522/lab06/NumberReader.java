package ca.bcit.comp2522.lab06;

public class NumberReader {
    private final InputReader inputReader;

    public NumberReader() {
        inputReader = new InputReader();
    }

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

    public static void main(String[] args) {
        NumberReader numberReader = new NumberReader();
        numberReader.guessNumber();
    }
}