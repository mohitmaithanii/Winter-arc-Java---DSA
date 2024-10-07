// ForEach.java

public class ForEachLoop {
   public static void main(String[] args) {
      // Array of names
      String[] names = { "Ram", "Harsh", "Ankit", "Mohit" };

      // Using for-each loop to iterate over the names array
      for (String name : names) {
         System.out.println("Name: " + name);
      }

      // Array of numbers
      int[] numbers = { 23, 12, 6, 7, 15, 3, 2, 56 };

      // Calculate the sum of numbers
      int sum = 0;
      System.out.println("Calculating sum of numbers:");
      for (int number : numbers) {
         sum += number;
      }
      System.out.println("Sum of numbers: " + sum);

      // Find the minimum number in the array
      int min = Integer.MAX_VALUE;

      for (int number : numbers) {
         if (number < min) {
            min = number;
         }
      }
      System.out.println("Minimum number: " + min);
   }
}