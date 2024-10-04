// Logical Operators Demo

public class LogicalOperators {

   public static void main(String[] args) {

      // Initialize two boolean variables
      boolean isFirstConditionTrue = true;
      boolean isSecondConditionTrue = false;

      // AND Operator (Logical Conjunction)
      // Both conditions must be true for the result to be true
      System.out.println("AND Operator: " + (isFirstConditionTrue && isSecondConditionTrue));

      // OR Operator (Logical Disjunction)
      // At least one condition must be true for the result to be true
      System.out.println("OR Operator: " + (isFirstConditionTrue || isSecondConditionTrue));

      // NOT Operator (Logical Negation)
      // Reverses the boolean value of the condition
      System.out.println("NOT Operator: " + !isFirstConditionTrue);

   }
}