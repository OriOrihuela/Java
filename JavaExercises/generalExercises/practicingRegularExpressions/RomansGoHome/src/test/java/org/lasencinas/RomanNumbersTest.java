package org.lasencinas;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class RomanNumbersTest {

    /* ---- Properties ---- */
    public static String[] romanNumbers;


    /* ---- Constructor ---- */
    @BeforeClass
    public static void romanNumbersSetupTest() {
        romanNumbers = new String[13];
        int romanNumbersCounter = 0;
        for (RomanNumbers number : RomanNumbers.values()) {
            romanNumbers[number.ordinal()] = number.name();
            romanNumbersCounter += 1;
        }
        assertThat(romanNumbersCounter).isEqualTo(RomanNumbers.values().length);
    }


    /* ---- Test cases ---- */
    @Test
    public void romanNumberConstructorTest() {
        RomanNumbers number = RomanNumbers.X;
        assertThat(number).isInstanceOf(RomanNumbers.class);
        assertThat(number.ordinal()).isEqualTo(4);
        assertThat(number.name()).isEqualToIgnoringWhitespace("X");
        assertThat(RomanNumbers.valueOf(number.name())).isEqualTo(RomanNumbers.X);
        assertThat(number.compareTo(number.X)).isEqualTo(0);
        assertThat(number.toString()).isEqualToIgnoringWhitespace("X");
        assertThat(number.equals(number.X)).isEqualTo(true);
        assertThat(RomanNumbers.values()[4]).isEqualTo(number);
    }

    @Test
    public void romanNumbersNamesIteratorTest() {
        for (RomanNumbers number : RomanNumbers.values()) {
            assertThat(number.name()).isIn(romanNumbers);
        }
    }

    @Test
    public void romanNumberGetValueTest() {
        RomanNumbers number = RomanNumbers.X;
        assertThat(number.getValue()).isEqualTo(10);
    }

    @Test
    public void sumRomanNumbersTest() {
        String romanNumbers1 = "MMM";
        int result = RomanNumbersUtil.sumRomanNumbers(romanNumbers1);
        assertEquals(3000, result);

        String romanNumbers2 = "MMMDCCCLXXXVIII";
        assertEquals(3888, RomanNumbersUtil.sumRomanNumbers(romanNumbers2));

        String romanNumbers3 = "MMDCCLXXVII";
        assertEquals(2777, RomanNumbersUtil.sumRomanNumbers(romanNumbers3));
    }
}
