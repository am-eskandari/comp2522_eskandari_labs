package ca.bcit.comp2522.lab04.calculator;

public class AdditionOperation extends AbstractOperation {
    public static final char ADDITION_SYMBOL = '+';


    public AdditionOperation(char operationType) {
        super(ADDITION_SYMBOL);

    }

    @Override
    public int perform(int operandA, int operandB) {
        return operandA + operandB;
    }
}
