package se.ifmo.ru;

public class SimpsonCalculator {

    private Function function;
    private double bottomLimit;
    private double topLimit;
    private double e;

    public Function getFunction() {
        return function;
    }

    public double getBottomLimit() {
        return bottomLimit;
    }

    public double getTopLimit() {
        return topLimit;
    }

    SimpsonCalculator(Function function, double bottomLimit, double topLimit, double accuracy) {
        this.function = function;
        this.e = accuracy;
        if (bottomLimit > topLimit) {
            this.bottomLimit = topLimit;
            this.topLimit = bottomLimit;
        } else {
            this.bottomLimit = bottomLimit;
            this.topLimit = topLimit;
        }
    }

    public void calculate() {
        for (int i = 4; i < 1000; i += 2) {

        }
    }


}
