import java.util.Scanner;

public class ForLoopExamples {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Example 1: Printing "Hello" using a for loop
      for (int i = 0; i <= 10; i++) {
         System.out.println("Hello");
      }

      // Example 2: Printing numbers from 0 to 5 using a for loop
      for (int i = 0; i <= 5; i++) {
         // Print the current value of i
         System.out.println(i);
      }

      // Example 3: Printing the multiplication table of a user-input number
      System.out.println("Enter a number: ");
      int number = scanner.nextInt();

      for (int i = 1; i <= 10; i++) {
         System.out.println(number + " * " + i + " = " + i * number);
      }

      // Example 4: Calculating the sum of n natural numbers
      System.out.println("Enter a number: ");
      int num = scanner.nextInt();
      int sum = 0;

      for (int i = 1; i <= num; i++) {
         sum += i;
      }
      System.out.println("Sum is " + sum);

      // Close the scanner to prevent resource leaks
      scanner.close();
   }
}