package org.lasencinas;


public class BinaryResearch {

    public static int binaryResearch(int[] array, int numberToBeFound) {
        int posLeft = 0;
        int posRight = array.length - 1;
        int posCentral = (posLeft + posRight) / 2;

        while (posLeft <= posRight && numberToBeFound != array[posCentral]) {
            if (numberToBeFound > array[posCentral]) {
                posLeft = posCentral + 1;
            } else {
                posRight = posCentral - 1;
            }
            posCentral = (posLeft + posRight) / 2;
        }
        if (array[posCentral] == numberToBeFound) {
            return posCentral;
        } else {
            return -1;
        }
    }
}
