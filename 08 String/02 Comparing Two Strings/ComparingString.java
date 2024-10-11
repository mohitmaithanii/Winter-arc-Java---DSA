// Comparing Strings in Java :

import java.util.Scanner;

public class ComparingString {

   public static void main(String[] args) {

      // Create two strings with the same value, but one is a literal and the other is
      // created using the 'new' keyword
      String name = "Mohit";
      String sameName = "Mohit";
      String newName = new String("Mohit");

      // Compare strings using '==', which checks for reference equality
      if (name == sameName) {
         // This will print because both 'name' and 'sameName' refer to the same string
         // literal in the string pool
         System.out.println("Both 'name' and 'sameName' are the same string literal");
      }

      if (name == newName) {
         System.out.println("Both 'name' and 'newName' are the same object");
      } else {
         System.out.println("Both 'name' and 'newName' are not the same object");
      }

      // Compare strings using '.equals()', which checks for value equality
      if (name.equals(newName)) {
         System.out.println("Both 'name' and 'newName' have the same value");
      } else {
         System.out.println("Both 'name' and 'newName' do not have the same value");
      }

      // add two strings:
      System.out.println("Enter your First Name : ");

      Scanner sc = new Scanner(System.in);
      String firstName = sc.nextLine();

      System.out.println("Enter your Last Name : ");
      String lastName = sc.nextLine();

      System.out.println("Your full Name is " + firstName + " " + lastName);

      sc.close();
   }
}