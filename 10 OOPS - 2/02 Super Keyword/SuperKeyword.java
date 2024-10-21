// Super Keyword in Java : 

// Parent class representing a generic Animal
class Animal {
   String name; // Instance variable to hold the name of the animal

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
   String breed; // Instance variable to hold the breed of the dog

   // Constructor of the child class to initialize both name and breed
   Dog(String name, String breed) {
      super(name); // Call the constructor of the parent class (Animal) to set the name
      this.breed = breed; // Assign the provided breed to the instance variable
   }

   // Method to display the dog's information, including its breed
   void display() {
      super.display(); // Call the display method of the parent class to show the animal's name
      System.out.println("Dog Breed: " + breed); 
   }
}

// Main class to test the functionality of the Dog class
public class SuperKeyword {
   public static void main(String[] args) {
      Dog dog = new Dog("Buddy", "Golden Retriever"); // Create a new Dog object
      dog.display(); // Call the display method to show the dog's information
   }
}

// Notes :
// - The 'super' keyword is a special keyword in Java that refers to the
// instance of the immediate parent class.
// - It is used to access instance variables of the parent class.
// - It allows invoking methods from the parent class.
// - It can also be used to invoke the constructor of the parent class.