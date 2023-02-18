package ca.bcit.comp2522.lab04.calculator;

/**
 * Performs the division operation on two integers.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class DivisionOperation extends AbstractOperation {
    /**
     * The character symbol for division.
     */
    public static final char DIVISION_SYMBOL = '/';

    /**
     * Constructs a DivisionOperation object.
     *
     * @param operationType the operation symbol in char
     */
    public DivisionOperation(final char operationType) {
        super(DIVISION_SYMBOL);
    }

    /**
     * Performs a division operation on the two operands.
     *
     * @param operandA the first operand as an integer
     * @param operandB the second operand as an integer
     * @return the integer division of two operands
     * @throws ArithmeticException if the second operand is zero
     */
    @Override
    public int perform(final int operandA, final int operandB) {
        if (operandB == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return operandA / operandB;
    }
}
