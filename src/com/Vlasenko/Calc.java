package com.Vlasenko;

public class Calc {

    protected final int intA;
    protected final int intB;
    protected final char action;

    public Calc(int intA, int intB, char action) {
        this.intA = intA;
        this.intB = intB;
        this.action = action;
    }

    public int calculate() {
        int result;
        switch (action) {
            case '+':
                result = intA + intB;
                break;
            case  '-':
                result = intA - intB;
                break;
            case '*':
                result = intA * intB;
                break;
            case '/':
                result = intA / intB;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + action);
        }
        return result;
    }
}
