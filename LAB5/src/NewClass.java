
public class NewClass {
  public static void main(String[] args){
        System.out.printf("%-10s %8s    |     %-8s %10s%n",
            "Celsius",
            "Fahrenheit",
            "Fahrenheit",
            "Celsius");
          
        for( int i=0,f=20; i<=100 && f<=270 ; i+=2 , f+=5){
            System.out.printf("%-11d%7.3f", i , (i *((float)9/5) +32) +"    |     "  + "%4d%21.3f\n" ,f ,((float)5/9)*(f-32));
        }
  
  }    
    }   

