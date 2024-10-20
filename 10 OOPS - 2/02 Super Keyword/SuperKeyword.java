// Super Keyword in Java : 

// Parent class representing a generic Animal
class Animal {
   String name;

   // Constructor of the parent class to initialize the animal's name
   Animal(String name) {
      this.name = name;
   }

   // Method to display the name of the animal
   void display() {
      System.out.println("Animal Name: " + name);
   }
}

// Child class representing a Dog, which is a specific type of Animal
class Dog extends Animal {
   String breed;

   // Constructor of the child class to initialize both name and breed
   Dog(String name, String breed) {
      super(name);
      this.breed = breed;
   }

   // Method to display the dog's information, including its breed
   void display() {
      super.display();
      System.out.println("Dog Breed: " + breed);
   }
}

// Main class to test the functionality of the Dog class
public class SuperKeyword {
   public static void main(String[] args) {
      Dog dog = new Dog("Buddy", "Golden Retriever");
      dog.display();
   }
}

// Notes :
// - The 'super' keyword is a special keyword in Java that refers to the
// instance of the immediate parent class.
// - It is used to access instance variables of the parent class.
// - It allows invoking methods from the parent class.
// - It can also be used to invoke the constructor of the parent class.