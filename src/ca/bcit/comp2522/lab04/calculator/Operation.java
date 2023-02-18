package ca.bcit.comp2522.lab04.calculator;

public interface Operation {

    public char getSymbol();
    public int perform(int operandA, int operandB);

}
