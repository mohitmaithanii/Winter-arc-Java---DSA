// Bitwise Operators :

public class Bitwise {

   public static void main(String[] args) {

      int a = 5;
      int b = 3;

      // * Bitwise NOT Operator (~)
      // It inverts all the bits of a number.
      int notResult = ~a;
      System.out.println("~a = " + notResult);

      // * Bitwise AND Operator (&)
      // It performs a binary operation on two numbers and
      // returns 1 only if both bits are 1.
      int andResult = a & b;
      System.out.println("a & b = " + andResult);

      // * Bitwise OR Operator (|)
      // It performs a binary operation on two numbers and
      // returns 1 if either of the bits is 1.
      int orResult = a | b;
      System.out.println("a | b = " + orResult);

      // * Bitwise XOR Operator (^)
      // It performs a binary operation on two numbers and
      // returns 1 if the bits are different.
      int xorResult = a ^ b;
      System.out.println("a ^ b = " + xorResult);

      // * Bitwise Left Shift Operator (<<)
      // It shifts the bits of a number to the left and
      // fills 0 on voids left as a result.
      int leftShiftResult = a << 1;
      System.out.println("a << 1 = " + leftShiftResult);

      // * Bitwise Right Shift Operator (>>)
      // It shifts the bits of a number to the right and
      // fills 0 on voids left as a result.
      int rightShiftResult = a >> 1;
      System.out.println("a >> 1 = " + rightShiftResult);

      // * Bitwise Unsigned Right Shift Operator (>>>)
      // It shifts the bits of a number to the right and
      // fills 0 on voids left as a result.
      int unsignedRightShiftResult = a >>> 1;
      System.out.println("a >>> 1 = " + unsignedRightShiftResult);
   }
}