
package H7;

public class H7_7 {
    public static void main(String[] args) {
  int[] numbers = new int[10];
   
  for (int i = 0; i < 200; i++) {
   numbers[intRandom(0, 9)]++;
  }   
  for (int i = 0; i < numbers.length; i++) {
   System.out.println("Number " + i + " appears " + numbers[i] + " times." ); 
  }
 }
 public static int intRandom(int lowerBound, int upperBound) {
  return (int) (lowerBound + Math.random()
    * (upperBound - lowerBound + 1));
 }
}
