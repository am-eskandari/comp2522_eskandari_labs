package ca.bcit.comp2522.lab04.calculator;

public class SubtractionOperation extends AbstractOperation{
    public static final char SUBTRACTION_SYMBOL = '-';


    public SubtractionOperation(char operationType) {
        super(SUBTRACTION_SYMBOL);

    }

    @Override
    public int perform(int operandA, int operandB) {
        return operandA - operandB;
    }
}
