package CalculatorService;
public class AdditionOperation implements CalculatorOperationInterface{

   @Override
   public int operation(int number1, int number2) {
      return number1+number2;
   }

}