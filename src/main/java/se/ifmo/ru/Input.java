package se.ifmo.ru;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static Function getFunction() {
        System.out.println("1 - " + Function.FIRST.toString() +
                "\n2 - " + Function.SECOND.toString() +
                "\n3 - " + Function.THIRD.toString() +
                "\n4 - " + Function.FORTH.toString() +
                "\n5 - " + Function.FIFTH.toString());
        System.out.println("Choose a function you want to integrate:");
        while (true) {
            try {
                switch (scanner.nextInt()) {
                    case 1:
                        return Function.FIRST;
                    case 2:
                        return Function.SECOND;
                    case 3:
                        return Function.THIRD;
                    case 4:
                        return Function.FORTH;
                    case 5:
                        return Function.FIFTH;
                }
            } catch (InputMismatchException e) {
                System.out.println("Choose one of the suggested functions.");
            }

        }
    }

    public static double getBottomLimit() {
        System.out.println("Enter bottom limit:");
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Bottom limit is a double number");
            }
        }
    }

    public static double getTopLimit() {
        System.out.println("Enter top limit:");
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Top limit is a double number");
            }
        }
    }

    public static double getAccuracy() {
        double accuracy;
        System.out.println("Enter accuracy:");
        while (true) {
            try {
                accuracy = scanner.nextDouble();
                if (accuracy >= 0)
                    throw new InputMismatchException();
                return accuracy;
            } catch (InputMismatchException e) {
                System.out.println("Accuracy is a double number less than 0");
            }
        }
    }


}
