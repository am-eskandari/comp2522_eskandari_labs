package ca.bcit.comp2522.lab04.calculator;

/**
 * Interface for mathematical operations that can be performed on two operands.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public interface Operation {

    /**
     * Fetch the symbol for the arithmetic operation.
     *
     * @return the char symbol for the operation
     */
    char getSymbol();

    /**
     * Performs the operation on two operands and returns the result.
     *
     * @param operandA the first operand as an integer
     * @param operandB the second operand as an integer
     * @return the integer result of arithmetic calculation
     */
    int perform(int operandA, int operandB);
}
