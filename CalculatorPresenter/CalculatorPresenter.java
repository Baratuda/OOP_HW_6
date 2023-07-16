package CalculatorPresenter;
import CalculatorModel.CalculatorModel;
import CalculatorViewPac.CalculatorView;

public class CalculatorPresenter implements CalculatorPresenterInterface{
    private CalculatorModel model;
    private CalculatorView view;
    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }
    //метод инициализирует значения для калькулятора (1-е число, 2-е число и оператор ) и передает их в калькулятор.
    @Override
    public void buttonClicked() {
           try{
              view.displayResult(model.calculate()); 
           }catch(NullPointerException ex){
            System.out.println("Please input valid parameter. Parameter must have String data type and eqals one of these symbols [+,-,*,/]");
            return;
           }
   
        
        
    }
}