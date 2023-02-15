import java.util.Scanner;
public class H9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int score,
                lowest = 0,
                secondLowest = 0;
        String name = "",
                student1 = "",
                student2 = "";
        
        System.out.println("Enter each students' name and score:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student: " + (i + 1) + "\n   Name: ");
            name = input.next();
            System.out.print("   Score: ");
            score = input.nextInt();
            
            if (i == 0) {
                lowest = score;
                student1 = name;   
            }
            else if ((i == 1 && score < lowest)){
                secondLowest = lowest;
                lowest = score;
                student2 = student1;
                student1 = name;  
            }
            else if ((i == 1)){
                secondLowest = score;
                student2 = name;
            }
            else if (i > 1 && score < lowest && score < secondLowest) {
                secondLowest = lowest;
                student2 = student1;
                lowest = score;
                student1 = name;
            }
            else if (i > 1 && score < secondLowest) {
                student2 = name;
                secondLowest = score;
            }  }
        System.out.println("Lowest scoring student: " + student1 +"\nSecond Higest scoring student: " + student2);
    }
}
