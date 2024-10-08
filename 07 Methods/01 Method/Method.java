// Method / Functions :
// * A method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation.

public class Method {
   // Main method, the entry point of the program

   public static void main(String[] args) {
      System.out.println(1);
      System.out.println(2);

      // Call the greet method to print a greeting message
      greet();

      System.out.println(3);
      System.out.println(4);
   }

   // Method to print a greeting message
   // This method is static, meaning it can be called without creating an instance of the class
   public static void greet() {
      System.out.println(5);
      System.out.println("Hello World!");
      System.out.println(6);
   }
}