package lab.pkg8;

import java.util.Scanner;
public class H_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = in.nextInt();
        int columns = in.nextInt();
        double[][] userArray = new double[rows][columns];
        System.out.println("Enter the array:");
        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < userArray[i].length; j++) {
                userArray[i][j] = in.nextDouble();
            }
        }

        int[] location = locateSmallest(userArray);
        System.out.printf("The location of the Smallest element is (%d, %d)%n",
            location[0], location[1]);
    }

    public static int[] locateSmallest(double[][] a) {
        int[] location = new int[]{0, 0};
        double smallest = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (smallest > a[i][j]) {
                    smallest = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }


}