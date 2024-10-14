// Demonstration of Method Overloading in Java

public class MethodOverloading {

   public static void main(String[] args) {

      // Create an instance of the Greet class
      Greet obj = new Greet();

      // Call the no-argument method
      obj.greetings();

      // Call the method with one String argument
      obj.greetings("Mohit");

      // Call the method with one String and one int argument
      obj.greetings("Amit", 5);
   }
}

class Greet {
   // Method with no arguments: default greeting
   void greetings() {
      System.out.println("Hello! Good Morning.");
   }

   // Method with one String argument: personalized greeting
   void greetings(String name) {
      System.out.println("Hello " + name + "! Good Morning.");
   }

   // Method with one String and one int argument: repeated personalized greeting
   void greetings(String name, int count) {
      for (int i = 0; i < count; i++) {
         System.out.println("Hello " + name + "! Good Morning.");
      }
   }
}

/*
 * Method Overloading Rules:
 * 
 * 1. Multiple methods can have the same name inside the same class if they
 * have different parameter lists.
 * 
 * 2. Methods can be overloaded by either:
 * (a) changing the number of parameters.
 * (b) or changing the data type of parameters.
 * 
 * 3. Changing only the return type of methods is not considered method
 * overloading.
 * There must be differences in the parameter lists.
 * 
 * 4. Method overloading is a form of compile-time polymorphism, meaning the
 * method to be called is determined at compile time.
 * 
 * 5. It is also known as compile-time binding or static binding.
 */