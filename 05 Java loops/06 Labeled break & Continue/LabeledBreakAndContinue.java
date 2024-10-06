// Demonstration of labeled break and continue statements

public class LabeledBreakAndContinue {

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      // Outer loop labeled as "outerLoop"
      outerLoop: for (int i = 0; i < 5; i++) {
         System.out.println("Outer loop iteration " + i);

         // Inner loop labeled as "innerLoop"
         innerLoop: for (int j = 0; j < 5; j++) {
            System.out.println("Inner loop iteration " + j);

            // If j reaches 3, break out of the outer loop
            if (j == 3) {
               break outerLoop; // Exit the outer loop
            }
         }
      }
   }
}