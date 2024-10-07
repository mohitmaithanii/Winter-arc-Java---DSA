// If-Else Statement Example

public class IfElse {
   public static void main(String[] args) {
      // Check if the person is eligible to vote
      int voterAge = 24;

      // If the voter's age is 18 or above, they can vote
      if (voterAge >= 18) {
         System.out.println("You are eligible to vote.");
      } else {
         System.out.println("You are not eligible to vote.");
      }

      // Check the day of the week
      int dayOfWeek = 1; // 1 = Monday, 2 = Tuesday, ..., 7 = Sunday

      // If it's Sunday, go home
      if (dayOfWeek == 7) {
         System.out.println("It's Sunday, go home!");
      } else {
         System.out.println("It's a weekday, go to the office.");
      }
   }
}