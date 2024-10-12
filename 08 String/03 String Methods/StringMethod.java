public class StringMethod {
   public static void main(String[] args) {
      // Basic String operations
      String name = "        MoHiT23     ";
      System.out.println("Original: '" + name + "'");
      System.out.println("Uppercase: " + name.toUpperCase());
      System.out.println("Lowercase: " + name.toLowerCase());
      System.out.println("Trimmed: '" + name.trim() + "'");

      // String checks
      String word = "Elephant";
      System.out.println("\nWord: " + word);
      System.out.println("Starts with 'Ele': " + word.startsWith("Ele"));
      System.out.println("Ends with 'ant': " + word.endsWith("ant"));
      System.out.println("Equals 'elephant': " + word.equalsIgnoreCase("elephant"));

      // Character operations
      System.out.println("\nCharacter at index 3: " + word.charAt(3));
      System.out.println("Index of 'p': " + word.indexOf('p'));
      System.out.println("Last index of 'e': " + word.lastIndexOf('e'));

      // Type conversion
      int number = 42;
      String stringNumber = String.valueOf(number);
      System.out.println("\nNumber + 3: " + (number + 3));
      System.out.println("StringNumber + 3: " + (stringNumber + 3));

      // String manipulation
      String sentence = "Java is a powerful language.";
      System.out.println("\nOriginal sentence: " + sentence);
      String newSentence = sentence.replace("Java", "Python");
      System.out.println("Modified sentence: " + newSentence);
      System.out.println("Contains 'powerful': " + sentence.contains("powerful"));

      // Substring
      String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      System.out.println("\nSubstring (3, 8): " + alphabet.substring(3, 8));

      // Splitting
      String fruits = "Apple,Banana,Cherry,Date";
      String[] fruitArray = fruits.split(",");
      System.out.println("\nSplit fruits:");
      for (String fruit : fruitArray) {
         System.out.println("- " + fruit);
      }

      // String to char array
      String color = "Indigo";
      char[] letters = color.toCharArray();
      System.out.println("\nLetters in '" + color + "':");
      for (char letter : letters) {
         System.out.println("- " + letter);
      }

      // Empty string check
      String emptyString = "";
      String nullString = null;
      System.out.println("\nIs emptyString empty? " + emptyString.isEmpty());
      System.out.println("Is nullString null? " + (nullString == null));

      // Additional string operations with letters
      String mixedCase = "aBcDeFgHiJkLmNoPqRsTuVwXyZ";
      System.out.println("\nMixed case: " + mixedCase);
      System.out.println("Length: " + mixedCase.length());
      System.out.println("Uppercase: " + mixedCase.toUpperCase());
      System.out.println("Lowercase: " + mixedCase.toLowerCase());

      String repeated = "ABC".repeat(3);
      System.out.println("Repeated string: " + repeated);

      String trimmed = "   XYZ   ".strip();
      System.out.println("Trimmed: '" + trimmed + "'");

      System.out.println("Is 'HELLO' alphabetic? " + "HELLO".matches("[A-Za-z]+"));
   }
}