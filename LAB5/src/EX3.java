
public class EX3 {
    public static void main(String[]args){
       int count = 1; 
        for(int i = 100 ;i<=1000 ; i++){
            if( i%3 == 0 && i%4 == 0){
               if ( count%10 == 0){
                   System.out.println (i);
               } 
               else {
               System.out.print(i + " ");
               }
               count ++ ;
                
            }
        }
        
    }
}
