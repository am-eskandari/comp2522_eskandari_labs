package ca.bcit.comp2522.lab04.calculator;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.Scanner;

public class RPNCalculator {
    private final Stack stack;

    public RPNCalculator(final int stackSize) {
        int MIN_SIZE = 2;
        if (stackSize < MIN_SIZE) {
            throw new IllegalArgumentException("Stack size must be at least 2.");
        }
        this.stack = new Stack(stackSize);
    }

    public int processFormula(final String formula) {
        if (formula == null || formula.length() == 0) {
            throw new IllegalArgumentException(("Formula cannot be null or empty."));
        }
        final Scanner scanner = new Scanner(formula);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                stack.push(scanner.nextInt());
            } else {
                final char operationSymbol = scanner.next().charAt(0);
                final Operation operation = getOperation(operationSymbol);
                perform(operation);
            }
        }
        return getResult();
    }

    private Operation getOperation(final char symbol) {
        return switch (symbol) {
            case '+' -> new AdditionOperation(symbol);
            case '-' -> new SubtractionOperation(symbol);
            case '*' -> new MultiplicationOperation(symbol);
            case '/' -> new DivisionOperation(symbol);
            default -> throw new IllegalArgumentException("Invalid operation: " + symbol);
        };
    }

    private void perform(final Operation operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null!");
        }

        final int operandB = stack.pop();
        final int operandA = stack.pop();
        final int result = operation.perform(operandA, operandB);
        stack.push(result);
    }

    public int getResult() {
        return stack.peek();
    }

    /**
     * Drives the program by evaluating the RPN calculation provided as
     * a command line argument.
     * <p>
     * Example usage: RPNCalculator 10 "1 2 +"
     * <p>
     * Note that the formula MUST be placed inside of double quotes.
     *
     * @param argv - the command line arguments are the size of the Stack
     *             to be created followed by the expression to evaluate.
     */
    public static void main(final String[] argv) {
// Checks for correct number of command line arguments.
        if (argv.length != 2) {
            System.err.println("Usage: Main <stack size> <formula>");
            System.exit(1);
        }
// Initializes stack and RPNCalculator.
        final int stackSize = Integer.parseInt(argv[0]);
        final RPNCalculator calculator = new RPNCalculator(stackSize);
        try {
            System.out.println("[" + argv[1] + "] = " + calculator.processFormula(argv[1]));
        } catch (final IllegalArgumentException ex) {
            System.err.println("formula can only contain integers, +, -, *, and /");
        } catch (final BufferOverflowException ex) {
            System.err.println("too many operands in the formula, increase the stack size");
        } catch (final BufferUnderflowException ex) {
            System.err.println("too few operands in the formula");
        }
    }
}
