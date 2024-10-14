// Method Overloading in Java : 

public class MethodOverloading {

   public static void main(String[] args) {

      Greet obj = new Greet();
      obj.greetings();
      obj.greetings("Mohit");
      obj.greetings("Amit", 5);
   }
}

class Greet {
   // Method with no arguments
   void greetings() {
      System.out.println("Hello! Good Morning.");
   }

   // Method with one String argument
   void greetings(String name) {
      System.out.println("Hello " + name + "! Good Morning.");
   }

   // Method with one String and one int argument
   void greetings(String name, int count) {
      for (int i = 0; i < count; i++) {
         System.out.println("Hello " + name + "! Good Morning.");

      }

   }
}

/*
 * 
 * 1. Two or more methods can have the same name inside the same class if they
 * accept different arguments.
 

 * 2. Methods overloading is achieved by either:
 * (a) changing the number of arguments.
 * (b) or changing the data type of arguments.
 
  
 * 3. It is not method overloading if we only change the return type of methods.
 * There must be differences in the number of parameters.
 

 * 4. Method overloading is a compile-time polymorphism, meaning the method to
 * be called is determined at compile time.
 
 
 * 5. It is also known as compile-time binding or static binding.
 */