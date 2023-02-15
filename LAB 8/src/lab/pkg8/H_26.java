package lab.pkg8;

import java.util.Scanner;
public class H_26 {
   public static void main(String[] args) {

        double[][] m = new double[4][4];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextDouble();


        double[][] sorted = sortRows(m);
        displayMatrix(sorted);
    }
    public static void displayMatrix(double[][] m) {
        System.out.println("The row−sorted array is");
       for (double[] m1 : m) {
           for (int j = 0; j < m1.length; j++) {
               System.out.printf("%2.3f ", m1[j]);
           }
           System.out.println("");
       }
    }
    public static double[][] sortRows(double[][] m) {

        double[][] sortedRows = new double[m.length][m[0].length];

        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                sortedRows[i][j] = m[i][j];

     
        for (int i = 0; i < sortedRows.length; i++) {

            for (int j = 0; j < sortedRows[0].length - 1; j++) {

                double currentMin = sortedRows[i][j];
                int minIndex = j;
                for (int column = j + 1; column < sortedRows[0].length; column++) {

                    if (currentMin > sortedRows[i][column]) {
                        currentMin = sortedRows[i][column];
                        minIndex = column;
                    }
                }

                if (minIndex != j) {
                    sortedRows[i][minIndex] = sortedRows[i][j];
                    sortedRows[i][j] = currentMin;
                }
            }
        }

        return sortedRows;
    }

} 

