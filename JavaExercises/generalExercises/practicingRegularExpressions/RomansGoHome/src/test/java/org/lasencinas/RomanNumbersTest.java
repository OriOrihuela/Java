package org.lasencinas;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.regex.Pattern;

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
        assertEquals(3000, RomanNumbersUtil.sumatoryRomanNumbers(romanNumbers1));

        String romanNumbers2 = "MMMDCCCLXXXVIII";
        assertEquals(3888, RomanNumbersUtil.sumatoryRomanNumbers(romanNumbers2));

        String romanNumbers3 = "MMDCCLXXVII";
        assertEquals(2777, RomanNumbersUtil.sumatoryRomanNumbers(romanNumbers3));

        String romanNumbers4 = "LXXX";
        assertEquals(80, RomanNumbersUtil.sumatoryRomanNumbers(romanNumbers4));
    }

    @Test
    public void subtractRomanNumbersTest() {
        String romanNumbers = "IX";
        assertEquals(9, RomanNumbersUtil.subtractiveRomanNumbers(romanNumbers));

        String romanNumbers2 = "XLIV";
        assertEquals(44, RomanNumbersUtil.subtractiveRomanNumbers(romanNumbers2));

        String romanNumbers3 = "CDXLIV";
        assertEquals(444, RomanNumbersUtil.subtractiveRomanNumbers(romanNumbers3));
    }

    @Test
    public void computeRomanNumbersTest() {
        String romanNumbers = "CDXXXIX";
        assertEquals(439, RomanNumbersUtil.computeRomanNumbers(romanNumbers));

        String romanNumbers2 = "CDL";
        assertEquals(450, RomanNumbersUtil.computeRomanNumbers(romanNumbers2));

        String romanNumbers3 = "DCLXVI";
        assertEquals(666, RomanNumbersUtil.computeRomanNumbers(romanNumbers3));

        String romanNumbers4 = "CMXCIX";
        assertEquals(999, RomanNumbersUtil.computeRomanNumbers(romanNumbers4));

        String romanNumbers5 = "MCDXLIV";
        assertEquals(1444, RomanNumbersUtil.computeRomanNumbers(romanNumbers5));
    }
}
