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
     * Constructs a new SubtractionOperation with the specified operation type.
     *
     * @param operationType - the operation type to use for the operation.
     */
    public SubtractionOperation(final char operationType) {
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
