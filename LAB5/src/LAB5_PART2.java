
import java.util.Scanner;
public class LAB5_PART2 {

    private static String output;
    private static Object s;
    public static void main (String[]args){
       Scanner input = new Scanner(System.in);
       int correct_count = 0; // the number of correct answers.
       int count = 0;  //count the number of qustions
       System.out.print(" \t\t\t\t Welcome To  My Math WorkBench ");
       System.out.println("\n 1_ Addition Quiz."
               + "\n 2_ Subtraction Quiz."
               + "\n 3_ Multiplication Quiz."
               + "\n 4_ Division Quiz."
               + "\n 5_ Exit Program.");
       System.out.println("\nEnter your choice :  ");
       int Choice = input.nextInt();
       System.out.println("How Many Quistion Do You Need : ");
       int n = input.nextInt();
      System.out.println("Press any Key to Start ");
        String String = input.nextLine();
        
       long StartTime = System.currentTimeMillis();
       
       while (Choice != 5){
           if (n==1){
            while (count <=n){
             int number1 = (int)(Math.random() * 10 );
             int number2 = (int)(Math.random() * 10 );
             System.out.println(number1 +" + " +number2 +" = ");
            int answer = input.nextInt();
            if(number1 + number2 == answer){
               System.out.println( answer +" is correct :) ");
            }else{
              System.out.println (answer +" is wrong!! ");}
            count++;
            }}
           if  (n == 2){
             while(count <= n){
             int number1= (int)(Math.random() * 10 );
             int number2 = (int)(Math.random() * 10 );
               if (number1 < number2 ){
                   int temp = number1;
                   number1 = number2;
                   number2 = temp;
               }
               System.out.print( +number1 +" - " +number2 +" = ");
               int answer = input.nextInt();
               if (number1 - number2 == answer){
                   System.out.println(answer +" is correct ");
               }else{
                   System.out.println(answer +" is wrong!!");
               }
               count++;
           }}
          if (n==3){
               while (count <=n){
             int number1 = (int)(Math.random() * 10 );
             int number2 = (int)(Math.random() * 10 );
             System.out.println(number1 +" * " +number2 +" = ");
            int answer = input.nextInt();
            if(number1 * number2 == answer){
               System.out.println( answer +" is correct :) ");
            }else{
              System.out.println (answer +" is wrong!! ");}
            count++;
          }   
          }
         if (n==4){
              while (count <=n){
             int number1 = (int)(Math.random() * 10 );
             int number2 = (int)(Math.random() * 10 );
             System.out.println(number1 +" / " +number2 +" = ");
            int answer = input.nextInt();
            if(number1 / number2 == answer){
               System.out.println( answer +" is correct :) ");
            }else{
              System.out.println (answer +" is wrong!! ");}
            count++;
           }
         }
         continue; 
    }
    
    System.out.println("Thank you for useing My Math WorkBench :) ");
    
    
    
    }
        
}
