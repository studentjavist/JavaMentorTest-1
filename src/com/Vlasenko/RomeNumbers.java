package com.Vlasenko;

public enum RomeNumbers {
    I(1, "I"),
    II(2, "II"),
    III(3, "III"),
    IV(4, "IV"),
    V(5, "V"),
    VI(6, "VI"),
    VII(7, "VII"),
    VIII(8, "VIII"),
    IX(9, "IX"),
    X(10, "X"),
    L(50, "L"),
    C(100, "C"),
    D(500, "D"),
    M(1000, "M");

    private final int decimalValue;
    public final String romeValue;

    RomeNumbers(int decimalValue, String romeValue) {
        this.decimalValue = decimalValue;
        this.romeValue = romeValue;
    }

    public static int romanToDecimal(String number) {
        number = number.toUpperCase();

        for (RomeNumbers romanNumber : RomeNumbers.values()) {
            if (romanNumber.name().equals(number)) return romanNumber.decimalValue;
        }

        throw new RuntimeException("Rome number not found");
    }

    public static String getRomeValue (int number) {
        for (RomeNumbers romanNumber : RomeNumbers.values()) {
            if (romanNumber.decimalValue == number) return romanNumber.romeValue;
        }
        throw new RuntimeException("Can't get romeValue: " + number);
    }

//    public static String decimalToRoman (int number) {
//       Не шмогла =(
//    }
}
