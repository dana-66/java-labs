// Dana SHATAT 220190488
package lab.pkg2;
import java.util.Scanner;
public class EX2 {
    public static void main(String[] arg){
    Scanner input = new Scanner( System.in);
    System.out.println(" Enter three numbers :");
    int numb1 = input.nextInt();
    int numb2 = input.nextInt();
    int numb3 = input.nextInt();
    int temp;
    
    if (numb1 > numb2 || numb1 > numb3){
        if( numb1 > numb2){
        temp=numb1;
        numb1 = numb2;
        numb2 = temp;
    }
        if ( numb1 > numb3 ){
        temp = numb1;
        numb1=numb3;
        numb3 = temp;
        }
       
    }
    if( numb3 < numb2 ){
        temp = numb2;
        numb2 = numb3;
        numb3 = temp;
    }
    System.out.println(numb1 + "  " +numb2 + "  " +numb3);   
    }
    }
    
    
    
    
    
    

