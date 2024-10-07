// Do-while Loop ;

/*
 * A do-while loop is used to execute a block of code at least once,
 * and then repeatedly execute it as long as a certain condition is true.
 */
public class Do {

   public static void main(String[] args) {

      int i = 10;

      // Use a do-while loop to print numbers from 10 to 5
      do {
         System.out.println(i);
         i++;
      }
      // Continue the loop as long as i is less than or equal to 5
      // Note: This condition will never be true, so the loop will only run once
      while (i <= 5);

      System.out.println("Out of the loop.");
   }
}