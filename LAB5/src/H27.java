
public class H27 {
    public static void main(String[] args) {
		System.out.println("All the leap years from 2014 to 2114:");
		int count = 0;
		for (int year = 2014; year <= 2114; year++) {
			
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				count++;
				
				System.out.print(year + (count % 10 == 0 ? "\n" : " "));
			} 
		}
		System.out.println();
	}
}
