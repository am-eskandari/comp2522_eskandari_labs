package ca.bcit.comp2522.lab04.calculator;

public class DivisionOperation extends AbstractOperation {
    public static final char DIVISION_SYMBOL = '/';


    public DivisionOperation(char operationType) {
        super(DIVISION_SYMBOL);

    }

    @Override
    public int perform(int operandA, int operandB) {
        if (operandB == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return operandA / operandB;
    }
}
