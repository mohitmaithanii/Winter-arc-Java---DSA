// Multi Dimensional Array in java : 

public class MultiDimensionalArray {

   public static void main(String[] args) {
      // Declare a 2D array to store student marks
      // Each row represents a student, and each column represents a subject
      int marks[][] = {
            // Student 1: Roll number 1
            { 12, 26, 96 }, // Marks in three subjects

            // Student 2: Roll number 2
            { 30, 95, 45 },

            // Student 3: Roll number 3
            { 60, 68, 35 },

            // Student 4: Roll number 4
            { 69, 94, 46 }
      };

      // Access and print specific marks
      System.out.println("Student 3's mark in subject 2: " + marks[2][1]);
      System.out.println("Student 3's mark in subject 3: " + marks[2][2]);
      System.out.println("Student 4's mark in subject 3: " + marks[3][2]);
   }
}
/*
 * marks[0][0] = 12;
 * marks[0][1] = 26;
 * marks[0][2] = 96;
 * 
 * marks[1][0] = 30;
 * marks[1][1] = 95;
 * marks[1][2] = 45;
 * 
 * marks[2][0] = 60;
 * marks[2][1] = 68;
 * marks[2][2] = 35;
 * 
 * marks[3][0] = 69;
 * marks[3][1] = 94;
 * marks[3][2] = 46;
 */
