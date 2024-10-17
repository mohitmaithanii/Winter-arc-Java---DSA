//  classes in Java :

public class MyClass {

   // This is the main method where the program starts
   public static void main(String[] args) {

      // we use the 'new' keyword to create a new object
      Dog d1 = new Dog();

      d1.name = "Tommy";
      d1.age = 5;
      d1.color = "Brown";

      // Methods are functions that belong to a class or object
      d1.bark();

      // Create a new Dog object called d2
      Dog d2 = new Dog();

      d2.name = "leo";
      d2.age = 3;
      d2.color = "Black";
      d2.walk();

      // Create a new Complex object called num1
      Complex num1 = new Complex();
      // Set the real part of num1 to 3
      num1.a = 3;
      // Set the imaginary part of num1 to 5
      num1.b = 5;
      num1.print();
   }
}

// This is a class to represent complex numbers
class Complex {
   // Real part of the complex number
   // In Java, we use 'int' to declare an integer variable
   int a;
   // Imaginary part of the complex number
   int b;

   // Method to print the complex number
   // In Java, we use 'void' to declare a method that does not return a value
   void print() {
      System.out.println("a = " + a + ", b = " + b);
   }
}

// This is a class to represent dogs
class Dog {
   // Name of the dog
   // In Java, we use 'String' to declare a string variable
   String name;
   // Age of the dog
   int age;
   // Color of the dog
   String color;

   // Method to make the dog walk
   void walk() {
      System.out.println(name + " is walking.");
   }

   // Method to make the dog bark
   void bark() {
      System.out.println(name + " is barking.");
   }
}