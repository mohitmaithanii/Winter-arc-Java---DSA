// Ternary Operator in Java

public class Ternary {

   public static void main(String[] args) {
      int a = 12;
      int b = 15;
      int c = 23;
      int max = 0;

      // * Using ternary operator to find the maximum of two numbers
      // If a is greater than b, assign a to max, otherwise assign b
      max = (a > b) ? a : b;

      // * Using nested ternary operator to find the maximum of three numbers

      // If a is greater than b, check if a is greater than c, if so assign a to max,
      // otherwise assign c
      // If a is not greater than b, check if b is greater than c, if so assign b to
      // max, otherwise assign c
      max = a > b ? (a > c ? a : c) : (b > c ? b : c);

      System.out.println("Value of max: " + max);
   }
}