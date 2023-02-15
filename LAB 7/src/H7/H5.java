package H7;
public class H5 {
 public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner (System.in);
        double [] numbers = new double[10];
        System.out.print("Enter numbers: ");
        for(int i = 0;i<numbers.length;i++){
            numbers[i] = input.nextDouble();
        }

        int Evens=0;
        int Odd=0 ;

        for(int i = 0;i<numbers.length;i++){
            
            if(numbers[i] > 0) {
              if(numbers[i] % 2 !=0)
                  Odd++;
              System.out.println("The number of odd numbers: " + Odd);}
                else{ 
                      System.out.println("The number of even numbers: " + Evens);
                  Evens++;
            }}
      
    }}




