package se.ifmo.ru;

public class SimpsonCalculator {

    private Function function;
    private double bottomLimit;
    private double topLimit;
    private double e;

    SimpsonCalculator(Function function, double bottomLimit, double topLimit, double accuracy) {
        this.function = function;
        this.bottomLimit = bottomLimit;
        this.topLimit = topLimit;
        this.e = accuracy;
    }

    public void calculate() {

    }
}
