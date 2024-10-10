// MyMath class provides various mathematical operations and utility methods

public class MyMath {

   public static void main(String[] args) {

      int a = 4;
      int b = 7;

      // Print the minimum and maximum values of a and b
      System.out.println("Minimum value: " + Math.min(a, b));
      System.out.println("Maximum value: " + Math.max(a, b));

      // Calculate and print the square root of 16
      System.out.println("Square root of 16: " + Math.sqrt(16));

      // Calculate and print the power of 3 raised to 4
      System.out.println("3 to the power of 4: " + Math.pow(3, 4));

      // Calculate and print the absolute value of 3
      System.out.println("Absolute value of 3: " + Math.abs(3));

      // Generate and print a random double value between 0 and 1
      System.out.println("Random value between 0 and 1: " + Math.random());

      // Calculate and print the floor value of 5.9
      System.out.println("Floor value of 5.9: " + Math.floor(5.9));

      // Calculate and print the ceiling value of 5.1
      System.out.println("Ceiling value of 5.1: " + Math.ceil(5.1));

      // Calculate and print the rounded value of 5.8
      System.out.println("Rounded value of 5.8: " + Math.round(5.8));

      // Generate and print a random integer between 1 and 10
      System.out.println("Random integer between 1 and 10: " + getRandom());

      // Generate and print a random integer between a and b (inclusive)
      System.out.println("Random integer between " + a + " and " + b + ": " + randomValue(a, b));
   }

   // Generates a random integer between 1 and 10

   public static int getRandom() {
      return (int) (Math.random() * 10 + 1);
   }

   // Generates a random integer between a and b (inclusive)

   public static int randomValue(int a, int b) {
      return (int) (Math.random() * (b - a + 1) + a);
   }
}