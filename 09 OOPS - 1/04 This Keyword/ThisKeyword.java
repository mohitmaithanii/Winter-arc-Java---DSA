// This Keyword in Java :
// In Java, this keyword is used to refer to the current object inside a method or a constructor.

public class ThisKeyword {
   public static void main(String[] args) {
      ThisKeyword example = new ThisKeyword("Alice", 30);
      example.display();
   }

   private String name;
   private int age;

   // Constructor
   public ThisKeyword(String name, int age) {
      // Using 'this' to refer to instance variables
      this.name = name;
      this.age = age;
   }

   // Method to display the values
   public void display() {
      System.out.println("Name: " + this.name);
      System.out.println("Age: " + this.age);
   }

}

// We mostly use this keyword to remove any ambiguity in Variable names.
// We can also use this to invoke method of the current class or to invoke a constructor of the current class.