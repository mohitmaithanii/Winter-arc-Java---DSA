// Assignment Operators

public class Assignment {
   public static void main(String[] args) {
      int a = 12;
      int b = 7;

      // Add b to a and store the result in a
      a += b; // a = a + b
      System.out.println("a += b: " + a);

      // Reset a to its original value
      a = 12;

      // Subtract b from a and store the result in a
      a -= b; // a = a - b
      System.out.println("a -= b: " + a);

      // Reset a to its original value
      a = 12;

      // Multiply a by b and store the result in a
      a *= b; // a = a * b
      System.out.println("a *= b: " + a);

      // Reset a to its original value
      a = 12;

      // Divide a by b and store the result in a
      a /= b; // a = a / b
      System.out.println("a /= b: " + a);

      // Reset a to its original value
      a = 12;

      // Calculate the remainder of a divided by b and store the result in a
      a %= b; // a = a % b
      System.out.println("a %= b: " + a);
   }
}