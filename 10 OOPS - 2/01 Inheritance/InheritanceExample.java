// Base class (Parent class)
class Animal {
   // Method to describe eating behavior
   void eat() {
      System.out.println("This animal eats food."); // Default behavior for animals
   }
}

// Derived class (Child class) that extends Animal
class Dog extends Animal {
   // Overriding the eat method to provide specific behavior for Dog
   @Override
   void eat() {
      System.out.println("The dog eats dog food."); // Specific behavior for dogs
   }

   // Method specific to Dog class
   void bark() {
      System.out.println("The dog barks."); // Behavior unique to dogs
   }
}

public class InheritanceExample {
   public static void main(String[] args) {
      // Creating an instance of Dog class
      Dog dog = new Dog();

      // Calling the overridden eat method from Dog class
      dog.eat(); // Calls the overridden method in Dog class

      // Calling the bark method from Dog class
      dog.bark(); // Calls the method from Dog class
   }
}