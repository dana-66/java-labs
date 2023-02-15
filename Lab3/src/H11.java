import java.util.Scanner;
public class H11 {
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println(" Enter a binary digit :");
    String binary = input.nextLine();
    //Dana Shatat
    switch( binary){
        case"0000": System.out.println( "the decimel value is:"+"0"); break;
        case"0001": System.out.println( "the decimel value is:"+"1"); break;
        case"0010": System.out.println( "the decimel value is:"+"2"); break;
        case"0011": System.out.println( "the decimel value is:"+"3"); break;
        case"0100": System.out.println( "the decimel value is:"+"4"); break;
        case"0101": System.out.println( "the decimel value is:"+"5"); break;
        case"0110": System.out.println( "the decimel value is:"+"6"); break;
        case"0111": System.out.println( "the decimel value is:"+"7"); break;
        case"1000": System.out.println( "the decimel value is:"+"8"); break;
        case"1001": System.out.println( "the decimel value is:"+"9"); break;
        case"1010": System.out.println( "the decimel value is:"+"A"); break;        
        case"1011": System.out.println( "the decimel value is:"+"B"); break;
        case"1100": System.out.println( "the decimel value is:"+"C"); break;
        case"1101": System.out.println( "the decimel value is:"+"D"); break;
        case"1110": System.out.println( "the decimel value is:"+"E"); break;
        case"1111": System.out.println( "the decimel value is:"+"F"); break;
        default: System.out.println (" invalid digit");
    }
    }
}
