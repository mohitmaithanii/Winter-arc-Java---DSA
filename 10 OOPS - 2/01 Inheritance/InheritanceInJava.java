// Base class (Parent class)
class Animal {
   void eat() {
      System.out.println("This animal eats food.");
   }
}

// Derived class (Child class)
class Dog extends Animal {
   void bark() {
      System.out.println("The dog barks.");
   }
}

public class InheritanceInJava {
   public static void main(String[] args) {
      Dog dog = new Dog(); // Create an object of the Dog class
      dog.eat(); // Call the inherited method from Animal class
      dog.bark(); // Call the method from Dog class
   }
}