package ca.bcit.comp2522.lab04.calculator;

/**
 * Performs an addition operation.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class AdditionOperation extends AbstractOperation {
    /**
     * The character symbol for addition.
     */
    public static final char ADDITION_SYMBOL = '+';

    /**
     * Constructs a new AdditionOperation.
     *
     * @param operationType the operation symbol in char
     */
    public AdditionOperation(final char operationType) {
        super(ADDITION_SYMBOL);
    }

    /**
     * Performs an addition operation on the two operands.
     *
     * @param operandA the first operand as an integer
     * @param operandB the second operand as an integer
     * @return the integer addition of two operands
     */
    @Override
    public int perform(final int operandA, final int operandB) {
        return operandA + operandB;
    }
}
