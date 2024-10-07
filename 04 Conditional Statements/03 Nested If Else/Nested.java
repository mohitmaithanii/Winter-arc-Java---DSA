// Nested if-else statement to find the maximum of three numbers

public class Nested {
   public static void main(String[] args) {
      // Initialize three numbers
      int a = 4;
      int b = 9;
      int c = 11;

      // Check if a is the largest
      if (a > b) {
         System.out.println("a is bigger than b");

         // Check if a is also larger than c
         if (a > c) {
            System.out.println("a is bigger than c");
            System.out.println("a is the biggest number: " + a);
         } else {
            // a is not larger than c, so c must be the largest
            System.out.println("c is bigger than a");
            System.out.println("c is the biggest number: " + c);
         }
      } else {
         // a is not larger than b, so check if b is the largest
         System.out.println("b is bigger than a");

         if (b > c) {
            System.out.println("b is bigger than c");
            System.out.println("b is the biggest number: " + b);
         } else {
            // b is not larger than c, so c must be the largest
            System.out.println("c is bigger than b");
            System.out.println("c is the biggest number: " + c);
         }
      }

      // logical operator in if-else :

      int time = 12;

      // AND operator: both conditions must be true
      if (time >= 10 && time <= 20) {
         System.out.println("Office is open");
      } else {
         System.out.println("Office is closed");
      }

      // OR operator: at least one condition must be true
      if (time == 12 || time == 6) {
         System.out.println("time for snacks.");
      } else {
         System.out.println("time to work.");
      }
   }
}