// Nested Loop :

public class NestedLoop {

   public static void main(String[] args) {

      // Print numbers 1 to 5, 11 times
      for (int outerCount = 0; outerCount <= 10; outerCount++) {
         // Inner loop to print numbers 1 to 5
         for (int innerCount = 1; innerCount <= 5; innerCount++) {
            System.out.print(innerCount + " ");
         }
         System.out.println(" printed " + outerCount);
      }

      // Print a pattern of asterisks
      for (int row = 0; row < 5; row++) {
         // Inner loop to print asterisks for each row
         for (int col = 0; col < row; col++) {
            System.out.print("* ");
         }
         System.out.println();
      }

      // Print numbers 0 to 5, 10 times using a while loop
      for (int outerIndex = 0; outerIndex < 10; outerIndex++) {
         int innerIndex = 0;
         while (innerIndex <= 5) {
            System.out.print(innerIndex + " ");
            innerIndex++;
         }
         System.out.println();
      }
   }
}