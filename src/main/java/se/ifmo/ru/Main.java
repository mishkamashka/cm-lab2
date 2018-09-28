package se.ifmo.ru;

public class Main {

    public static void main(String[] args) {
        SimpsonCalculator calculator = new SimpsonCalculator(Input.getFunction(), Input.getBottomLimit(), Input.getTopLimit(), Input.getAccuracy());

    }

}