package org.lasencinas;

import java.util.Arrays;
import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        int[] vector = new int[30];
        Random aleatorio = new Random();
        for (int index = 0; index < vector.length; index++) {
            vector[index] = aleatorio.nextInt(20) + 1;
        }
        Arrays.sort(vector);
        for (int number : vector) {
            System.out.println(number);
        }
    }
}

