
package lab.pkg2;
import java.util.Scanner;
public class EX3 {
    public static void main (String[] arg){
   Scanner input = new Scanner ( System.in);
   System.out.print(" Enter today :");
   int day = input.nextInt();   
   System.out.print(" Enter the day after the day :");
   int dayafter = input.nextInt();
   
   int futureday =( day + dayafter )%7;
   System.out.print("today is :");
   switch (day ){
       case 0 : System.out.println("Sunday"); break;
       case 1 : System.out.println("Monday"); break;
       case 2 : System.out.println("Tuesday"); break;
       case 3 : System.out.println("Wednsday"); break;
       case 4 : System.out.println("Thursday"); break;
       case 5: System.out.println("Fryday"); break;
       case 6 : System.out.println("Saturday");
     }
    System.out.print(" and future day is :");
   switch (futureday ){
       case 0 : System.out.println("Sunday"); break;
       case 1 : System.out.println("Monday"); break;
       case 2 : System.out.println("Tuesday"); break;
       case 3 : System.out.println("Wednsday"); break;
       case 4 : System.out.println("Thursday"); break;
       case 5: System.out.println("Fryday"); break;
       case 6 : System.out.println("Saturday");
     }
    }
}
