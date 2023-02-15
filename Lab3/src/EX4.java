
public class EX4 {
 public static void main (String[]args){
     //Dana Shatat 
      String result = "";
      char ch1 = (char)('A'+(int)( Math.random() * ('Z' - 'A'+1))); 
      result +=ch1;
       char ch2 = (char)('A'+(int)( Math.random() * ('Z' - 'A'+1))); 
      result +=ch2;
       char ch3 = (char)('A'+(int)( Math.random() * ('Z' - 'A'+1))); 
      result +=ch3;
      int num1 =(int)(Math.random()*10);
      result +=num1;
       int num2 =(int)(Math.random()*10);
      result +=num2;
       int num3 =(int)(Math.random()*10);
      result +=num3;
       int num4 =(int)(Math.random()*10);
      result +=num4;
      System.out.println(" the plate number is " +result);
 
 }   
}
