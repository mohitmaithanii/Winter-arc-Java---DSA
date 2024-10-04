// Arithmetic Operators in Java

public class Arithmetic {

   public static void main(String[] args) {
      // Declare and initialize two integer variables
      int a = 12;
      int b = 7;

      // Addition
      int additionResult = a + b;
      System.out.println("Addition result: " + additionResult);

      // Subtraction
      int subtractionResult = a - b;
      System.out.println("Subtraction result: " + subtractionResult);

      // Multiplication
      int multiplicationResult = a * b;
      System.out.println("Multiplication result: " + multiplicationResult);

      // Division (cast one of the operands to double to get decimal result)
      double divisionResult = (double) a / b;
      System.out.println("Division result: " + divisionResult);

      // Modulo (remainder of division)
      int moduloResult = a % b;
      System.out.println("Modulo result: " + moduloResult);
   }
}