/**
 * The Primitive Lottery is a game of chance regulated by the National Organization of State Lotteries and Bets (LAE)
 * which consists of choosing 6 different numbers between 1 and 49.
 * To win the winning combination in the corresponding draw, 6 balls are drawn from a drum.
 * In addition an extra ball is extracted as a complementary number, and another ball from a separate drum,
 * between 0 and 9, which acts as a "re-entry" number.
 * Write a program that generates 5 combinations of the primitive lottery. It has to be visualized in the way:
 *
 * Combination 1: 4, 2, 7,23,45,34 Complementary: 13 Reimbursement: 5
 *
 * Combination 2: Complementary: 12 Refund: 4
 *
 * Save the numbers in an ArrayList and "menéalos" them using the suffle method.
 */

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
