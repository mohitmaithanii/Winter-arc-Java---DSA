// Super Keyword in Java :

// Parent class
class Animal {
   String name;

   // Constructor of the parent class
   Animal(String name) {
      this.name = name;
   }

   // Method of the parent class
   void display() {
      System.out.println("Animal Name: " + name);
   }
}

// Child class
class Dog extends Animal {
   String breed;

   // Constructor of the child class
   Dog(String name, String breed) {
      // Calling the constructor of the parent class
      super(name);
      this.breed = breed;
   }

   // Method of the child class
   void display() {
      // Calling the method of the parent class
      super.display();
      System.out.println("Dog Breed: " + breed);
   }
}

// Main class to test the example
public class SuperKeyword {
   public static void main(String[] args) {
      Dog dog = new Dog("Buddy", "Golden Retriever");
      dog.display();
   }
}

