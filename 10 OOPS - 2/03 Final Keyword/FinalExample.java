// final keyword in java :

/* public class FinalKeyword {

   public static void main(String[] args) {
      final int MAX_VALUE = 100; 
      System.out.println("Max Value: " + MAX_VALUE);

      // Uncommenting the next line will cause a compile-time error
      // MAX_VALUE = 200; // Error: cannot assign a value to final variable MAX_VALUE
      // This line would result in an error because final variables cannot be reassigned.
   }
} */

// Parent class that contains a final method
class Parent {
   // This method is declared as final, preventing subclasses from overriding it.
   final void display() {
      System.out.println("This is a final method in the Parent class.");
   }
}

// Child class that attempts to extend the Parent class
class Child extends Parent {
   // Uncommenting the next method will cause a compile-time error
   // void display() { // Error: cannot override the final method from Parent
   // System.out.println("Trying to override.");
   // }
   // The above method cannot be overridden because the display method in the
   // Parent class is final.
}

// This class contains the main method to run the program
public class FinalExample {
   public static void main(String[] args) {
      // Creating an instance of the Parent class
      Parent obj = new Parent();
      // Calling the final method from the Parent class
      obj.display();
   }
}