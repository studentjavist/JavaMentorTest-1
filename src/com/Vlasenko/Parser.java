package com.Vlasenko;

public class Parser {
    public static ParseResult parse (String inputString) {
        ParseResult result = null;

        for (int i = 0; i < inputString.length(); i++) {
            char tempChar = inputString.charAt(i);
            if (tempChar == '+' || tempChar == '-' || tempChar == '*' || tempChar == '/') {
                result = new ParseResult(inputString.substring(0, i - 1), inputString.substring(i + 2), inputString.charAt(i));
            }
        }

        if (result == null) {
            throw new RuntimeException("Action not found");
        }
        else return result;
    }

    public static class ParseResult {
        public final String operandA;
        public final String operandB;
        public char action = '?';

        public ParseResult (String operandA, String operandB, char action) {
            this.operandA = operandA;
            this.operandB = operandB;
            this.action = action;
        }

        @Override
        public String toString() {
            return "ParseResult{" +
                    "operandA='" + operandA + '\'' +
                    ", operandB='" + operandB + '\'' +
                    ", action=" + action +
                    '}';
        }
    }
}