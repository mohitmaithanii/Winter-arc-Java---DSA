// Constructors in Java :

public class LearnConstructors {
   public static void main(String[] args) {
      // Create two complex numbers using the Complex class constructor
      Complex num1 = new Complex(2, 3);
      Complex num2 = new Complex(4, 1);

      num1.print();
      num2.print();
   }
}

// This class represents complex numbers
class Complex {
   // These are the instance variables (data members) of the class
   // They are used to store the real and imaginary parts of a complex number
   private int realPart;
   private int imaginaryPart;

   // This is a constructor, a special method that is used to initialize objects
   // It is called when we create a new object of the class
   public Complex(int real, int imaginary) {
      // Initialize the instance variables with the provided values
      this.realPart = real;
      this.imaginaryPart = imaginary;
   }

   void print() {
      System.out.println(realPart + " + " + imaginaryPart + " i");
   }
}

// Important notes about constructors:
// 1. Constructors are called automatically when we create a new object.

// 2. To create a constructor, you must follow these two rules:
// (a) The constructor name must be the same as the class name.
// (b) A Java constructor must not have a return type (not even void).

// 3. If you don't create a constructor, Java will create a default constructor
// for you.
// The default constructor sets the instance variables to their default values.

// 4. A default constructor is a constructor that is created automatically by
// Java.

// 5. A constructor cannot be abstract, static, or final.

// 6. You can create multiple constructors with different parameters (this is
// called overloading),
// but you cannot create a constructor with the same parameters in a subclass
// (this is called overriding).