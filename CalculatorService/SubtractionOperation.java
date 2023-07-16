package CalculatorService;

public class SubtractionOperation implements CalculatorOperationInterface{

   @Override
   public int operation(int number1, int number2) {
      return number1-number2;
   }
   
   
}
