package CalculatorService;

public class MultiplicationOperation implements CalculatorOperationInterface{

   @Override
   public int operation(int number1, int number2) {
      return number1*number2;
   }
   
}
