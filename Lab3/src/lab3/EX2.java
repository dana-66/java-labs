
package lab3;
import java.util.Scanner;
public class EX2 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println(" Enter a letter :");
    String L = input.nextLine();
    char ch = L.charAt(0);
    if (Character.isLetter(ch)){
        switch(Character.toUpperCase(ch)){
            case'A':
            case'E':
            case'I':
            case'O':
            case'U': System.out.println(ch +" is a vowel"); break;
            default: System.out.println(ch +" is consonant");
            
        }}    //Dana Shatat
         else{
        System.out.println( ch +"is not valid");
                
     }
    }
    
    }

