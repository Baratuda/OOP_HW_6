package CalculatorViewPac;

import java.util.Scanner;

public class CalculatorView{

    public void displayResult(int result) {
    System.out.println("Результат: " + result);
    }

    public static String getUserInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextLine();
    }
}
