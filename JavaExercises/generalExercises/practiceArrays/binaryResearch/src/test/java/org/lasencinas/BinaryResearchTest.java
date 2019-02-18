package org.lasencinas;

import static org.junit.Assert.*;
import org.junit.Test;

public class BinaryResearchTest {

    @Test
    public void binaryResearchTest() {
        BinaryResearch test = new BinaryResearch();
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int numberToBeFound = 5;
        int result = test.binaryResearch(array, numberToBeFound);
        assertEquals(4, result);
    }

    @Test
    public void binaryResearchTest1() {
        BinaryResearch test = new BinaryResearch();
        int[] array = {34,35,36,37,38};
        int numberToBeFound = 39;
        int result = test.binaryResearch(array, numberToBeFound);
        assertEquals(-1, result);
    }

    @Test
    public void binaryResearchTest2() {
        BinaryResearch test = new BinaryResearch();
        int[] array = {10,11,12,13,14,15,16,17};
        int numberToBeFound = 11;
        int result = test.binaryResearch(array, numberToBeFound);
        assertEquals(1, result);
    }
}