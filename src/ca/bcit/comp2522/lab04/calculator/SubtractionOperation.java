package ca.bcit.comp2522.lab04.calculator;

/**
 * Performs a subtraction operation.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class SubtractionOperation extends AbstractOperation {
    /**
     * The subtraction symbol used to create a new SubtractionOperation.
     */
    public static final char SUBTRACTION_SYMBOL = '-';

    /**
     * Constructs a new SubtractionOperation object.
     */
    public SubtractionOperation() {
        super(SUBTRACTION_SYMBOL);
    }

    /**
     * Performs the subtraction operation on the specified operands, and returns the result.
     *
     * @param operandA - the first operand to use for the subtraction operation.
     * @param operandB - the second operand to use for the subtraction operation.
     * @return the result of the subtraction operation.
     */
    @Override
    public int perform(final int operandA, final int operandB) {
        return operandA - operandB;
    }
}
