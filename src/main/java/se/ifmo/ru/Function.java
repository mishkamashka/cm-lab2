package se.ifmo.ru;

public enum Function {

    FIRST("y = sin(x*3/2) + 1/2"), SECOND("y = log(x/5 + cos(2*x))"), THIRD("y = sqrt(cos(x^2))"), FORTH("5*(x^5) + 3*x^0.5)"), FIFTH("x^(x^2)");

    private String function;

    Function(String function) {
        this.function = function;
    }

    public double calculateFunction(double x) {
        switch (this) {
            case FIRST:
                return (Math.sin(x * 3 / 2) + 0.5);
            case SECOND:
                return Math.log(x / 5 + Math.cos(2 * x));
            case THIRD:
                return Math.sqrt(Math.cos(Math.pow(x, 2)));
            case FORTH:
                return 5 * Math.pow(x, 5) + 3 * Math.pow(x, 0.5);
            case FIFTH:
                return Math.pow(x, Math.pow(x, 2));
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return this.function;
    }
}
