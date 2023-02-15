package H7;

public class H2 {
     public static void main(String[]args){
  
       
       int [] list = new int[11];
       int data =0;
       int index = 0;
       
       while (data!=0){
           list [index]=data;
           index++;
           
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

