package ca.bcit.comp2522.lab04.calculator;

public abstract class AbstractOperation implements Operation {
    protected char operationType;

    public AbstractOperation(char operationType) {
        this.operationType = operationType;
    }

    public final char getSymbol() {
        return operationType;
    }

}
