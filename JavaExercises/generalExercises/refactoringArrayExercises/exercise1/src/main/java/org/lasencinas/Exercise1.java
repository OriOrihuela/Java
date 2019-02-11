package org.lasencinas;


public class Exercise1 {
    public static void main(String[] args) {
        double[] sales = {8000, 320.35, 930, 1020.99, 650};
        double major = sales[0];
        double minor = sales[0];
        double total = 0;
        int majorIndex = 0;
        int minorIndex = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > major) {
                major = sales[i];
                majorIndex = i;
            } else if (sales[i] < minor) {
                minor = sales[i];
                minorIndex = i;
            } total += sales[i];
        }
        System.out.println("The store that sold less was " + (minorIndex + 1) + ", " +
                "which sold " + minor + " €");
        System.out.println("The store that sold more was " + (majorIndex + 1) + ", " +
                "which sold " + major + " €");
        System.out.println("The total amount of sales is: " + total + " €");
    }
}

