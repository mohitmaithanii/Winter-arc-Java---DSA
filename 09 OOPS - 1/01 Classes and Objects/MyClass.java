// Classes in Java :

public class MyClass {

   public static void main(String[] args) {

      Dog d1 = new Dog();
      d1.name = "Tommy";
      d1.bark();

      Dog d2 = new Dog();
      d2.name = "leo";
      d2.walk();

      Complex num1 = new Complex();
      num1.a = 3;
      num1.b = 5;
      num1.print();
   }
}

class Complex {
   int a, b;

   void print() {
      System.out.println("a = " + a + ", b = " + b);
   }
}

class Dog {
   String name;
   int age;
   String color;

   void walk() {
      System.out.println(name + " is walking.");

   }

   void bark() {
      System.out.println(name + " is barking.");
   }
}

class Cat {

}