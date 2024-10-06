// While loop :

import java.util.Scanner;

public class WhileLoopExample {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Example 1: Print numbers from 0 to 5 using a while loop
      int i = 0;
      while (i <= 5) {
         // Print the current value of i
         System.out.println("The current value of i is: " + i);
         // Increment i by 1
         i++;
      }

      // Example 2: Use a while loop to simulate learning process
      boolean hasLearnt = false;
      while (!hasLearnt) {
         System.out.println("Went to school, tried to learn.");
         System.out.println("Did you learn? (true/false)");

         hasLearnt = scanner.nextBoolean();
      }

      scanner.close();
   }
}