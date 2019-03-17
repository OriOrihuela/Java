/**
 * Write a program in which 8 values ​​between 1 and 10 are randomly generated without repeated numbers.
 * Stores the numbers in a set (TreeSet).
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        for (Integer number: list) {
            if (number <= 8) {
                set.add(number);
            }
        }

        System.out.println(set);
    }
}
