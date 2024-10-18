// Base class (Parent class)
class Animal {
   void eat() {
      System.out.println("This animal eats food.");
   }
}

// Derived class (Child class)
class Dog extends Animal {
   @Override
   void eat() {
      System.out.println("The dog eats dog food.");
   }

   void bark() {
      System.out.println("The dog barks.");
   }
}

public class InheritanceExample {
   public static void main(String[] args) {
      Dog dog = new Dog();
      dog.eat(); // Calls the overridden method
      dog.bark(); // Calls the method from Dog class
   }
}