package com.Vlasenko;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        Parser.ParseResult parseResult = Parser.parse(inputString);
        if (isArabic(parseResult.operandA) && isArabic(parseResult.operandB)) {
            Calc arabicCalc = new Calc(Integer.parseInt(parseResult.operandA), Integer.parseInt(parseResult.operandB), parseResult.action);
            System.out.println(arabicCalc.calculate());
        }
        else {
            RomeCalc romeCalc = new RomeCalc(parseResult.operandA, parseResult.operandB, parseResult.action);
            System.out.println(romeCalc.calculateRome());
        }
    }

    private static boolean isArabic (String operand) {
        return operand.matches("\\d+");
    }
}
