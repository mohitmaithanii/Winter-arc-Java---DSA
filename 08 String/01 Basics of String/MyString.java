/* 
 * Sting :
 * In java, String is basically an object that represents a sequence of   char values. An array of characters works same as Java String. 
 

 * Immutable String in Java :
 * String object are immutable. Immutable simply means unmodifiable or unchangeable.
 * Once a String object is created its data or state can't be changed. 
 */

public class MyString {

   public static void main(String[] args) {

      // Create a string object using string literal
      String name = "Mohit"; // This will create a string object in the string pool

      // Create a string object using new keyword
      String newName = new String("Mohit"); // This will create a new string object in the heap

      // Print the values of name and newName
      System.out.println(name); // Output: Mohit
      System.out.println(newName); // Output: Mohit

      // Print a string literal
      System.out.println("Mohit"); // Output: Mohit
   }
}