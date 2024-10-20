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

public class InheritanceInJava {
   public static void main(String[] args) {
      // Creating an instance of Dog class
      Dog dog = new Dog();

      // Calling the overridden eat method from Dog class
      dog.eat(); // Calls the overridden method in Dog class

      // Calling the bark method from Dog class
      dog.bark(); // Calls the method from Dog class
   }
}

// Notes : 
// Inheritance is one of the key features of OOP that allows us to create a new class from an existing class.

// The new class that is created is know as subclass (child or derived class)  and the existing class from where the child class is derived is know as superclass (parent or base class).

// If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.

// method overriding is also known as runtime polymorphism, Hence, we can achieve Polymorphism in java with the help of inheritance.