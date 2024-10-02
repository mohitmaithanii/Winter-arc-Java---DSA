// Data Type Conversion in Java : 
// type conversion, also known as type casting, is the process of converting a value of one data type to another data type.

public class TypeConversion {

   public static void main(String[] args) {

      //*  Implicit Conversion : Automatic conversion from a smaller data type to a larger data type
      int count = 12;
      long countLong = count; // No need for explicit casting, Java does it automatically
      System.out.println(countLong);

      //*  Explicit Conversion : Manual conversion from a larger data type to a smaller data type
      long score = 12;
      int scoreInt = (int) score; // Explicit type casting is required to avoid compile-time error
      System.out.println(scoreInt);

      // Example of explicit conversion that may result in data loss
      int age = 128;
      byte newAge = (byte) age; // age is larger than the maximum value of byte, so data loss occurs
      System.out.println(newAge);

   }

}