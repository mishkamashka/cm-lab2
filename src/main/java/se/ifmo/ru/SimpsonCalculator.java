package se.ifmo.ru;

public class SimpsonCalculator {

    private Function function;
    private double bottomLimit;
    private double topLimit;
    private double accuracy;
    private double p;
    private double uac;
    private double result;

    public Function getFunction() {
        return function;
    }

    public double getBottomLimit() {
        return bottomLimit;
    }

    public double getTopLimit() {
        return topLimit;
    }

    public double getP() {
        return p;
    }

    public double getUac() {
        return uac;
    }

    public double getResult() {
        return result;
    }

    SimpsonCalculator(Function function, double bottomLimit, double topLimit, double accuracy) {
        this.function = function;
        this.accuracy = accuracy;
        if (bottomLimit > topLimit) {
            this.bottomLimit = topLimit;
            this.topLimit = bottomLimit;
        } else {
            this.bottomLimit = bottomLimit;
            this.topLimit = topLimit;
        }
    }

    public int calculate() {
        double i1;
        double i2;
        double h;
        if (topLimit != bottomLimit) {
            for (int n = 4; n <= 10000; n += 2) {
                double sum1 = 0;
                double sum2 = 0;
                h = (topLimit - bottomLimit) / n;
                for (int i = 1; i < n; i++) {
                    sum1 += 4 * function.calculateFunction(bottomLimit + i * h);
                    i++;
                    sum1 += 2 * function.calculateFunction(bottomLimit + i * h);
                }
                i1 = (sum1 + function.calculateFunction(bottomLimit) - function.calculateFunction(topLimit) * h / 3);

                h = (topLimit - bottomLimit) / (2 * n);
                for (int i = 1; i < 2 * n; i++) {
                    sum2 += 4 * function.calculateFunction(bottomLimit + i * h);
                    i++;
                    sum2 += 2 * function.calculateFunction(bottomLimit + i * h);
                }
                i2 = (sum1 + function.calculateFunction(bottomLimit) - function.calculateFunction(topLimit) * h / 3);

                if (Math.abs(i2 - i1) / 15 < accuracy) {
                    result = i2;
                    p = n;
                    uac = Math.abs(i2 - i1) / 15;
                    return 0;
                }
                if (n == 10000) {
                    p = 0;
                    return -1;
                }
            }
        }
        else {
            result = 0;
            p = 0;
            return 1;
        }
    }
}
