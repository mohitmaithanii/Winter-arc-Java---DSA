// Creating Array in Java

public class Array {
   public static void main(String[] args) {
      // Declare and allocate an integer array of size 5
      int age[] = new int[5];

      // Initialize the array elements
      age[0] = 5;
      age[1] = 2;
      age[2] = 8;
      age[3] = 4;
      age[4] = 6;

      // Print the array elements
      System.out.println("Age array elements:");
      System.out.println(age[0]);
      System.out.println(age[1]);
      System.out.println(age[2]);
      System.out.println(age[3]);
      System.out.println(age[4]);

      // Print the length of the array
      System.out.println("Length of age array: " + age.length);

      // Declare and initialize an integer array using an array initializer
      int marks[] = { 98, 23, 43, 50, 74 };

      // Print the array elements
      System.out.println("Marks array elements:");
      System.out.println(marks[0]);
      System.out.println(marks[1]);

      // Formula to calculate the memory address of an array element:
      // address of Zero + index * size

      /*
       * - address of Zero is the base address of the array
       * - index is the position of the element in the array
       * - size is the size of each element in the array (e.g., 4 bytes for int)
       */
   }
}