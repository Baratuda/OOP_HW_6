package CalculatorModel;
import CalculatorService.AdditionOperation;
import CalculatorService.CalculatorOperationInterface;
import CalculatorService.DivisionOperation;
import CalculatorService.MultiplicationOperation;
import CalculatorService.SubtractionOperation;
import CalculatorViewPac.CalculatorView;
public class CalculatorModel implements CalculatorModelInterface{
    private int result;
    private int number1;
    private int number2;
    private String parameter;

    public CalculatorModel() {
        try{
            this.number1 = Integer.valueOf(CalculatorView.getUserInput("Plese input first number: "));
            this.parameter = CalculatorView.getUserInput("Plese input parameter: ");
            this.number2 = Integer.valueOf(CalculatorView.getUserInput("Plese input second number: ")); 
        }catch(NumberFormatException ex){
            System.out.println("Please input valid numbers.");
            return;
        }
    }

    public int getNumber1() {
        return this.number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return this.number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getParameter() {
        return this.parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    //Метод вычисляет результат двух чисел исходя их оператора. И бросает 
    //nullPointerException есди был задан невырный оператор.
    @Override
    public int calculate() {
            switch (this.parameter) {
                case "+":
                    CalculatorOperationInterface additionOperation = new AdditionOperation();
                    this.result =  additionOperation.operation(this.number1, this.number2);
                    break;
                case "-":
                    CalculatorOperationInterface subtractionOperation = new SubtractionOperation();
                    this.result = subtractionOperation .operation(this.number1, this.number2);
                    break;
                case "*":
                    CalculatorOperationInterface multiplicationOperation = new MultiplicationOperation();
                    this.result = multiplicationOperation.operation(this.number1, this.number2);
                    break;
                case "/":
                    CalculatorOperationInterface dvisionOperation = new DivisionOperation();
                    this.result = dvisionOperation.operation(this.number1, this.number2);
                    break; 
                default:
                  throw new NullPointerException();             
            }

        return this.result;
    }
}
