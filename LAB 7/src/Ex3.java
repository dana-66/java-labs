import java.util.Scanner;
public class Ex3 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Scores your input should end with 0:  ");
        
        int[] scores = new int[100];
        int num; 						   	// Hold user input
		int numberOfScores; 			   	// Number of scores
		int average; 					   	// Average score
		numberOfScores = average = 0;		// Initialize accumulator to 0;
		for (int i = 0; i < 100; i++) {
			num = input.nextInt();			
			if (num < 0)						// A negative number signifies end
				break;
			
			scores[i] = num;					// fill scores array
			average += num;					// Add scores to average
			numberOfScores++;					// Increment number of scores
		}

		average /= numberOfScores;	

		int aboveOrEqual;						// Scores above or equal to average
		int below;								// Scores below average
		aboveOrEqual = below = 0;
		for (int i = 0; i < numberOfScores; i++) {
			if (scores[i] >= average)
				aboveOrEqual++;				// Increment aboveOrEqual
			else
				below++;							// Increment below
                
                }
		// Display results
		System.out.println("\nAverage of scores: " + average);
		System.out.println(
			"Number of scores above or equal to average: " + aboveOrEqual);
		System.out.println(
			"Number of scores below average: " + below);
	}

       
      
}
