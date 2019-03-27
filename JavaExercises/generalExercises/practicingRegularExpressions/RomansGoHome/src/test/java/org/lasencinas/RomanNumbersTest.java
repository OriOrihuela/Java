package org.lasencinas;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;

public class RomanNumbersTest {

    /* ---- Properties ---- */
    public static String[] romanNumbers;


    @BeforeClass
    public static void romanNumbersSetupTest() {
        romanNumbers = new String[7];
        int romanNumbersCounter = 0;
        for (RomanNumbers number : RomanNumbers.values()) {
            romanNumbers[number.ordinal()] = number.name();
            romanNumbersCounter += 1;
        }
        assertThat(romanNumbersCounter).isEqualTo(RomanNumbers.values().length);
    }

    @Test
    public void romanNumberConstructorTest() {
        RomanNumbers number = RomanNumbers.X;
        assertThat(number).isInstanceOf(RomanNumbers.class);
        assertThat(number.ordinal()).isEqualTo(2);
        assertThat(number.name()).isEqualToIgnoringWhitespace("X");
        assertThat(RomanNumbers.valueOf(number.name())).isEqualTo(RomanNumbers.X);
        assertThat(number.compareTo(number.X)).isEqualTo(0);
        assertThat(number.toString()).isEqualToIgnoringWhitespace("X");
        assertThat(number.equals(number.X)).isEqualTo(true);
        assertThat(RomanNumbers.values()[2]).isEqualTo(number);
    }

    @Test
    public void romanNumbersNamesIteratorTest() {
        for (RomanNumbers planeta : RomanNumbers.values()) {
            assertThat(planeta.name()).isIn(romanNumbers);
        }
    }

    @Test
    public void romanNumberGetValueTest() {
        RomanNumbers planeta = RomanNumbers.X;
        assertThat(planeta.getValue()).isEqualTo(10);
    }
}
