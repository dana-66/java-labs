import java.util.Scanner;
public class EX2 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the number of the student :");
        int numberofstudent = input.nextInt();
        int count = 1;
        int highestScore = 0;
        String highestScoreName="";
        
        while(count <= numberofstudent){
            System.out.println("Student name :" +(count) +"\n" +"Name:  ");
            String name = input.next();
            System.out.print("Score : ");
            int score = input.nextInt ();
            if (score>highestScore) {
                highestScore = score;
                 highestScoreName = name ;
            }
            count ++;
        }
        System.out.println(" the hightest Student Name : " + highestScoreName +"   Score :" +highestScore) ;
    }
}
