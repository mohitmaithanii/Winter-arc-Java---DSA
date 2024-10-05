// Else-if statement :

public class ElseIf {

   public static void main(String[] args) {

      // Check the day of the week
      int dayOfWeek = 1; // 1 = Monday, 2 = Tuesday, ..., 7 = Sunday

      // If it's Sunday, go home
      if (dayOfWeek == 7) {
         System.out.println("It's Sunday, go home!");
      } else if (dayOfWeek == 2) {
         System.out.println("It's Tuesday, go to work!");
      } else if (dayOfWeek == 3) {
         System.out.println("It's Wednesday, go to party!");
      } else {
         System.out.println("It's a weekday, go to the office.");
      }
   }
}
