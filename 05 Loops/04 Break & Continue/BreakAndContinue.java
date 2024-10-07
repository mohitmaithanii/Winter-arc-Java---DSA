// Break and Continue Statements :

public class BreakAndContinue {
   public static void main(String[] args) {
      // Example 1: Using break in a for loop
      // Print even numbers from 0 to 20, but stop when we reach 10
      for (int number = 0; number <= 20; number += 2) {
         System.out.println(number);

         // If we've reached 10, exit the loop
         if (number >= 10) {
            break;
         }
      }

      // Example 2: Using break in a while loop
      // Print numbers from 0 to 5, but stop when we reach 3
      int counter = 0;
      while (counter <= 5) {
         System.out.println(counter);
         counter++;

         // If we've reached 3, exit the loop
         if (counter == 3) {
            break;
         }
      }

      // Example 3: Using continue in a for loop
      // Give toffee to everyone from 0 to 10, except for 2 and 6
      for (int person = 0; person <= 10; person++) {
         // Skip 2 and 6
         if (person == 2 || person == 6) {
            continue;
         }
         System.out.println("gave toffee to " + person);
      }
   }
}