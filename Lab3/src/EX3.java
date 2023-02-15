import java.util.Scanner;
public class EX3 {
public static void main (String[]args) {
    Scanner input = new Scanner(System.in);
    System.out.print(" Enter two char :");
    String str = input.nextLine();
    char m = Character.toUpperCase(str.charAt(0));
    char s = str.charAt(1);
    switch (m){                    //Dana Shatat
        case 'I': System.out.print("Informationn Mangment"); break;
        case 'C': System.out.print("Computer Science"); break; 
        case 'A': System.out.print("Accounting"); break;
        default: System.out.print("Invalid input"); 
                System.exit(0);
    }
    switch (s){
        case '1': System.out.print(" Freashman"); break;
        case '2': System.out.print(" sophomore"); break;
        case '3': System.out.print(" junior"); break;
        case '4': System.out.print(" senior"); break;
        default: System.out.print("Invalid input"); break;
    }

}    
}
