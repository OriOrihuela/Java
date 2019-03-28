package org.lasencinas;

public class RomanNumbersUtil {

    /* ---- Behaviours ---- */
    public static int sumRomanNumbers(String romanNumbers) {
        int sumCounter = 0;
        for (int index = 0; index < romanNumbers.length(); index++) {
            Character number = romanNumbers.charAt(index);
            for (RomanNumbers romanNumber : RomanNumbers.values()) {
                if (romanNumber.name().equals(number.toString())) {
                    sumCounter += romanNumber.getValue();
                }
            }
        }
        return sumCounter;
    }
}
