
package lab.pkg7;
import java.util.Scanner;
public class LAB7 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the number of students: ");
       int numberOfstudents = input.nextInt();
       System.out.print("enter" +numberOfstudents +"Scors: ");
       int[] scores = new int[numberOfstudents];
       
       for(int i=0; i<numberOfstudents; i++)
           scores[i] = input.nextInt();
           
       int max = scores[0];
       for(int i=1; i<numberOfstudents; i++)
           if(max<scores[i])   max = scores[i];
       
       char ch;
       for(int i=0; i<numberOfstudents; i++){
           if(scores[i]>=(max-5))
               ch = 'A';
           else if (scores[i]>=(max-10))
               ch = 'B';
           else if (scores[i]>=(max-15))
               ch = 'C';
           else if (scores[i]>=(max-20))
               ch = 'D';
           else 
               ch = 'F';
        System.out.println("Students " +i +" Score " +scores[i] +" and the grade is:" +ch );
    }}
    
}
