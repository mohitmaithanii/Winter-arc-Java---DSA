// Creating Array in Java

public class Array {
   public static void main(String[] args) {
      // Declare and allocate an integer array of size 5
      int ages[] = new int[5];

      // Initialize the array elements
      ages[0] = 5;
      ages[1] = 2;
      ages[2] = 8;
      ages[3] = 4;
      ages[4] = 6;

      // Print the array elements
      System.out.println("ages array elements:");
      System.out.println(ages[0]);
      System.out.println(ages[1]);
      System.out.println(ages[2]);
      System.out.println(ages[3]);
      System.out.println(ages[4]);

      // Print the length of the array
      System.out.println("Length of ages array: " + ages.length);

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