package ca.bcit.comp2522.lab04.calculator;

public class MultiplicationOperation extends AbstractOperation{
    public static final char MULTIPLICATION_SYMBOL = '*';


    public MultiplicationOperation(char operationType) {
        super(MULTIPLICATION_SYMBOL);

    }

    @Override
    public int perform(int operandA, int operandB) {
        return operandA * operandB;
    }
}
