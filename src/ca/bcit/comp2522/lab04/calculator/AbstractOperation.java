package ca.bcit.comp2522.lab04.calculator;

/**
 * Abstract class that sets the operation type and contains a method for retrieving the operation symbol.
 *
 * @author Amir Eskandari
 * @version 1.0
 */
public abstract class AbstractOperation implements Operation {

    /**
     * Operation Type.
     */
    protected char operationType;


    /**
     * Constructs a new AbstractOperation object with the specified operation type.
     *
     * @param operationType the type of the operation
     */
    public AbstractOperation(final char operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the symbol for an operation.
     *
     * @return the symbol for this operation
     */
    @Override
    public final char getSymbol() {
        return operationType;
    }

}
