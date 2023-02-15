import java.util.Scanner;
public class EX2 {
   public static void main(String[]args){
    
       Scanner input = new Scanner(System.in);
       System.out.print("Enter integers between 1 and 50 your input should end with 0:  ");
       int [] list = new int[100];
       int data = input.nextInt();
       int index = 0;
       
       while (data!=0){
           list [index]=data;
           index++;
           data = input.nextInt();
       }
       int currentSize = index;
       int[] counts = new int[50];
       for(int i=0; i < currentSize; i++)
             counts[list[i]-1]++;
       
       
       for (int i=0; i<50; i++)
           if(counts[i]>0)
           System.out.println((i+1) +" occures " +counts[i] +"times");

}
}