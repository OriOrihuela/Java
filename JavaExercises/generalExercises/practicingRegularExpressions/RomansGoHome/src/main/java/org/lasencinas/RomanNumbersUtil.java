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

    public static int subtractRomanNumbers(String romanNumbers) {
        int subtractCounter = 0;
        for (int index = 0; index < romanNumbers.length(); index++) {
            try {
                Character number = romanNumbers.charAt(index);
                Character nextNumber = romanNumbers.charAt(index + 1);
                String romanNumber = number.toString() + nextNumber.toString();
                for (RomanNumbers numbers : RomanNumbers.values()) {
                    if (numbers.name().equals(romanNumber)) {
                        subtractCounter += numbers.getValue();
                    }
                }
            } catch (StringIndexOutOfBoundsException exception) {
                //
            }
        }
        return subtractCounter;
    }
}
