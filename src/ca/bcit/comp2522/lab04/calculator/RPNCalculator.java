package ca.bcit.comp2522.lab04.calculator;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.Scanner;

/**
 * Provides a method for processing reverse, polish notation formulas,
 * and returning the result of the calculation.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class RPNCalculator {

    /**
     * The stack used to store operands during formula processing.
     */
    private final Stack stack;

    /**
     * Constructs an RPNCalculator with the specified stack size.
     *
     * @param stackSize - the size of the stack to create.
     * @throws IllegalArgumentException - if the stack size is less than 2.
     */
    public RPNCalculator(final int stackSize) {
        int MIN_SIZE = 2;
        if (stackSize < MIN_SIZE) {
            throw new IllegalArgumentException("Stack size must be at least 2.");
        }
        this.stack = new Stack(stackSize);
    }


    /**
     * Processes the specified formula using the RPN algorithm, and returns the result.
     *
     * @param formula - the formula to process.
     * @return the result of the calculation.
     * @throws BufferOverflowException - if too many operands are encountered in the formula.
     * @throws BufferUnderflowException - if too few operands are encountered in the formula.
     * @throws IllegalArgumentException - if formula is null or empty.
     */
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

    /**
     * Performs the specified Operation using the operands at the top of the stack,
     * and pushes the result onto the stack.
     *
     * @param operation - the Operation to perform.
     * @throws IllegalArgumentException - if the Operation is null.
     */
    private void perform(final Operation operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null!");
        }

        final int operandB = stack.pop();
        final int operandA = stack.pop();
        final int result = operation.perform(operandA, operandB);
        stack.push(result);
    }

    /**
     * Returns the result of the calculation, which is the top value on the stack.
     *
     * @return the result of the calculation.
     */
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
