package se.ifmo.ru;

public class Main {

    public static void main(String[] args) {
        SimpsonCalculator calculator = new SimpsonCalculator(Input.getFunction(), Input.getBottomLimit(), Input.getTopLimit(), Input.getAccuracy());
        switch (calculator.calculate()) {
            case -1:
                System.out.println("Accuracy cannot be reached. No solution.");
                break;
            case 0:
                System.out.println("Result: " + calculator.getResult());
                System.out.println("Error: " + calculator.getUac());
                System.out.println("Steps amount: " + calculator.getP());
                break;
            case 1:
                System.out.println("Limits are equal.");
                System.out.println("Result: " + calculator.getResult());
                System.out.println("Error: " + calculator.getUac());
                System.out.println("Steps amount: " + calculator.getP());
        }
    }

}