// Taking User Inout/Output with Scanner :

import java.util.Scanner;

public class UserInput {

   public static void main(String[] args) {
      // Create a new Scanner object to read from the standard input (System.in)
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter your age: ");
      int age = scanner.nextInt(); // Read an integer value from the user
      System.out.println("Your age is " + age);

      System.out.print("Enter the first number: ");
      int firstNumber = scanner.nextInt(); // Read the first integer value

      System.out.print("Enter the second number: ");
      int secondNumber = scanner.nextInt(); // Read the second integer value

      // Calculate the sum of the two numbers
      int result = firstNumber + secondNumber;
      System.out.println("Sum of the two numbers is " + result);

      // Close the Scanner object to prevent resource leaks
      scanner.close();
   }
}

/*
 * Input Types :
 * 
 * nextBoolean() - Reads a boolean value from the user
 * nextByte() - Reads a byte value from the user
 * nextDouble() - Reads a double value from the user
 * nextFloat() - Reads a float value from the user
 * nextInt() - Reads a int value from the user
 * nextLine() - Reads a String value from the user
 * nextLong() - Reads a long value from the user
 * nextShort() - Reads a short value from the user
 */