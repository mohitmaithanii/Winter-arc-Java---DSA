// Example of method parameters in Java

public class MethodParams {

   public static void main(String[] args) {
      // Calling the printAverage method with two integers and a boolean
      printAverage(10, 20, true);

      // Calling the calculateAverage method with two integers
      int result = calculateAverage(15, 25);
      System.out.println("The average is: " + result);
   }

   // Method to print the average of two numbers, with an option to display the result
   public static void printAverage(int num1, int num2, boolean shouldPrint) {
      int average = (num1 + num2) / 2;
      System.out.println("The average is: " + average);

   }

   // Method to calculate and return the average of two numbers
   public static int calculateAverage(int num1, int num2) {
      return (num1 + num2) / 2;
   }
}