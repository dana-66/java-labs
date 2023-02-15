package lab.pkg8;
import java.util.Scanner;
public class EX1 {
    public static void main (String[]args){
        double[][] matrix = new double [3][4];
        getMatrix(matrix);
        
        for(int col=0; col<matrix[0].length; col++){
            System.out.println("Sum of the elements at column " +col +" is " +sumOfcolumn(matrix, col));
            
        }
    }
    
    public static void getMatrix(double[][] m){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a" +m.length +"_by_" +m[0].length +" matrix row by row: ");
        
        for(int row =0; row<m.length; row++){
            for(int col = 0; col <m[row].length; col++)
                    m[row][col] = input.nextDouble();
        }
    }
    
    public static double sumOfcolumn(double[][] m, int columnIndex){
        double sum = 0;
        for (int row =0 ; row <m.length ; row++){
             sum+= m[row][columnIndex];
        }
        return sum;
    }



}
