package com.Vlasenko;

public class RomeCalc extends Calc {

    public RomeCalc(String operandA, String operandB, char action) {
        super(RomeNumbers.romanToDecimal(operandA), RomeNumbers.romanToDecimal(operandB), action);
    }

    public String calculateRome() {
        int result = super.calculate();
        if (result < 1) throw new RuntimeException("Impossible rome number: " + result);

        if (result < 11) {
            return(RomeNumbers.getRomeValue(result));
        }
        else if (result < 20) {
            return("X" + ((RomeNumbers.getRomeValue(result - 10))));
        }
        else if (result == 20) return("XX");
        else if (result < 30) {
            return("XX" + ((RomeNumbers.getRomeValue(result%10))));
        }
        else if (result == 30) return("XXX");
        else if (result < 40) {
            return("XXX" + ((RomeNumbers.getRomeValue(result - 30))));
        }
        else if (result == 40) return("XL");
        else if (result < 50) {
            return("XL" + ((RomeNumbers.getRomeValue(result - 40))));
        }
        else if (result == 50) return("L");
        else if (result < 60) {
            return("L" + ((RomeNumbers.getRomeValue(result - 50))));
        }
        else if (result == 60) return("LX");
        else if (result < 70) {
            return("LX" + ((RomeNumbers.getRomeValue(result - 60))));
        }
        else if (result == 70) return("LXX");
        else if (result < 80) {
            return("LXX" + ((RomeNumbers.getRomeValue(result - 70))));
        }
        else if (result == 80) return("LXXX");
        else if (result < 90) {
            return("LXXX" + ((RomeNumbers.getRomeValue(result - 80))));
        }
        else if (result == 90) return("XC");
        else if (result < 100) {
            return("XC" + ((RomeNumbers.getRomeValue(result - 90))));
        }
        else if (result == 100) {
            return("C");
        }
        else return("Something wrong");

    }
}