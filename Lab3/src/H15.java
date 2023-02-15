import java.util.Scanner;
public class H15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        ch = Character.toUpperCase(ch);
        
        int number = 0;                //Dana Shatat
        switch (ch) {
         case 'A':
         case 'B':
         case 'C':
         number = 2;break;
         case 'D':
         case 'E':
         case 'F':
         number = 3;break;
         case 'G':
         case 'H':
         case 'I':
        number = 4;break;
        case 'J':
        case 'K':
        case 'L':
        number = 5;break;
        case 'M':
        case 'N':
        case 'O':
        number = 6;break;
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        number = 7;break;
        case 'T':
        case 'U':
        case 'V':
        number = 8;break;
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        number = 9; break;
        default: number = 0;break;
        }
    if (number != 0) {
   System.out.print("The corresponding number is " + number);
   System.exit(0);
  }
    System.out.print(s + " is an invalid input");
    }
}
