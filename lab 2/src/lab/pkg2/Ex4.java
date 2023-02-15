
package lab.pkg2;
import java.util.Scanner;
public class Ex4 {
    public static void main (String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the weight of the packege :");
        double weight = input.nextDouble();
        
        if (weight > 20 ){
            System.out.print(" the packege cannot be shipped");
        }
        else{
            double costperpound;
          if (weight > 0 && weight <=2 ){
              costperpound= 2.5;
        }else if (weight<= 4){
            costperpound=4.5;
        }
        else if (weight <= 10){
            costperpound=7.5;
        }
        else {
            costperpound=10.5;
        }
        System.out.print(" the shipping cost of packege is in $ " + costperpound * weight);
        }
    }
}
