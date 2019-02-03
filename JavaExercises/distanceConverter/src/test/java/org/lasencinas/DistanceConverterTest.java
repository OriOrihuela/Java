package org.lasencinas;


import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple DistanceConverter.
 */
public class DistanceConverterTest {
    double feet, meters, inches, cm;

    @Test
    public void testConvertFeetToMeters() {
        feet = 1;
        meters = DistanceConverter.convertFeetToMeters(feet);
        assertEquals(meters, 0.3048,0.001);
    }

    @Test
    public void testConvertMetersToFeet() {
        meters = 1;
        feet = DistanceConverter.convertMetersToFeet(meters);
        assertEquals(3.281,feet,0.001);
    }

    @Test
    public void testConvertFeetToInches() {
        feet = 1;
        inches = DistanceConverter.convertFeetToInches(feet);
        assertEquals(12,inches,0.001);
    }

    @Test
    public void testConvertInchesToFeet() {
        inches = 12;
        feet = DistanceConverter.convertInchesToFeet(inches);
        assertEquals(1,feet,0.001);
    }

    @Test
    public void testConvertCmToFeet() {
        cm = 10;
        feet = DistanceConverter.convertCmToFeet(cm);
        assertEquals(0.3281,feet,0.001);
    }

    @Test
    public void testConvertFeetToCm() {
        feet = 1;
        cm = DistanceConverter.convertFeetToCm(feet);
        assertEquals(30.48,cm,0.001);
    }

    @Test
    public void testConvertCmToInches() {
        cm = 10;
        inches = DistanceConverter.convertCmToInches(cm);
        assertEquals(3.9371,inches,0.001);
    }

    @Test
    public void testConvertInchesToCm() {
        inches = 10;
        cm = DistanceConverter.convertInchesToCm(inches);
        assertEquals(25.4,cm,0.001);
    }
}
