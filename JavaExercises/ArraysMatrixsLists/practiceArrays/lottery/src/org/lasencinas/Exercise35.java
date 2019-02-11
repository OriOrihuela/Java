package org.lasencinas;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Exercise35 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> refund = new ArrayList<>();

        for (int i = 0; i <= 49; i++){
            numbers.add(i);
        }

        for (int i = 0; i <= 9; i++) {
            refund.add(i);
        }

        for (int i = 0; i < 5; i++) {
            Collections.shuffle(numbers);
            Collections.shuffle(refund);
            System.out.print("Combinacion " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print(numbers.get(j) + ",");
            }
            // Escribo el ultimo numero aparte para no ponerle la coma.
            System.out.print(numbers.get(5));
            System.out.print("    Complementario: " + numbers.get(6));
            System.out.println("\tReintegro: " + refund.get(0));
        }
    }

}
