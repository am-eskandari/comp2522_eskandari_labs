package ca.bcit.comp2522.lab04.calculator;

/**
 * Performs the multiplication of two integers.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public class MultiplicationOperation extends AbstractOperation {
    /**
     * The character symbol for multiplication.
     */
    public static final char MULTIPLICATION_SYMBOL = '*';

    /**
     * Constructs a MultiplicationOperation object.
     */
    public MultiplicationOperation() {
        super(MULTIPLICATION_SYMBOL);
    }

    /**
     * Performs a multiplication operation on the two operands.
     *
     * @param operandA the first operand as an integer
     * @param operandB the second operand as an integer
     * @return the integer division of two operands
     */
    @Override
    public int perform(final int operandA, final int operandB) {
        return operandA * operandB;
    }
}
