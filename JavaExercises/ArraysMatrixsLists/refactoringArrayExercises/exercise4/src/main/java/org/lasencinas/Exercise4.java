package org.lasencinas;

public class Exercise4 {
    public static void main(String[] args) {

        int[][] matrix = new int[10][10];

        //Give values and write them
        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < 10; column++) {
                if (row == column) {
                    matrix[row][column] = 1;
                }
                else {
                    matrix[row][column] = 0;
                }
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
