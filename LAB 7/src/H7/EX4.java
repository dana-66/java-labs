
package H7;
import java.util.Scanner;
public class EX4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
          System.out.print("enter 10 numbers: ");
          int [] list = new int[10];
          for(int i=0; i<10; i++)
             list[i] = input.nextInt();
       int[] newList = eliminateDuplicate(list);
       
        for(int i=0; i<newList.length; i++)
            System.out.print(newList[i] +" ");
    
    }   
    public static int[] eliminateDuplicate(int[] list){
        int[] newList = new int[list.length];
        int currentSize =0;
        for(int i=0; i<list.length; i++){
            boolean found=false;
            for(int j=0; j<currentSize ; j++)
                if(list[i]==newList[j])
                    found = true;
            if(!found){
                newList[currentSize] = list[i];
                currentSize++;
            }
                
    }
            int[] result = new int[currentSize]; 
        System.arraycopy(newList, 0, result, 0, currentSize);
            
    return result;        
    }
}

