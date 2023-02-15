
public class H5 {
     public static void main(String[] args){
        System.out.printf("celsius     farenheit    |     celsius         farenheit   ");
            
        
        for (int i=0,f=20; i<=100 && f<=270 ; i+=2 , f+=5){    
            System.out.printf("%-11d%7.3f", i , (i *((float)9/5) +32));
            System.out.print("       |   ");
            System.out.printf("%4d%21.3f\n" ,f ,((float)5/9)*(f-32));
        }    
    }
}
